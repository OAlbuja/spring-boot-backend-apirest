package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tempoquito.springboot.backend.apirest.models.dto.ClienteInteresDTO;
import com.tempoquito.springboot.backend.apirest.models.dto.ClienteDistanciaDTO;

@Service
public class KNNService {

    @Autowired
    private IClienteInteresService clienteInteresService;
    
    @Autowired
    private IInteresService interesService;


    public List<ClienteDistanciaDTO> encontrarVecinosCercanos(Long clienteId, int k) {
        // Obtiene los intereses y ponderaciones del cliente objetivo
        List<ClienteInteresDTO> interesesClienteObjetivo = clienteInteresService.findInteresesByClienteId(clienteId);
        double[] interesesArrayClienteObjetivo = convertirInteresesADoubleArray(interesesClienteObjetivo);

        // Obtiene los IDs de todos los clientes excepto el cliente objetivo
        List<Long> todosLosClienteIds = clienteInteresService.findAllClienteIdsExcept(clienteId);

        // Validación de k
        if (k > todosLosClienteIds.size()) {
            k = todosLosClienteIds.size(); // Ajusta k al número de clientes disponibles
            // Opcional: Puedes lanzar una advertencia o un mensaje informativo aquí
        }
        
        // Calcula las distancias y las almacena en una lista de ClienteDistanciaDTO
        List<ClienteDistanciaDTO> distancias = todosLosClienteIds.stream()
            .map(id -> {
                List<ClienteInteresDTO> interesesClienteComparado = clienteInteresService.findInteresesByClienteId(id);
                double[] interesesArrayClienteComparado = convertirInteresesADoubleArray(interesesClienteComparado);
                double distancia = calcularDistanciaEuclidiana(interesesArrayClienteObjetivo, interesesArrayClienteComparado);
                return new ClienteDistanciaDTO(id, distancia);
            })
            .sorted(Comparator.comparingDouble(ClienteDistanciaDTO::getDistancia))
            .limit(k)
            .collect(Collectors.toList());

        return distancias;
    }

    private double[] convertirInteresesADoubleArray(List<ClienteInteresDTO> interesesDTO) {
        long totalIntereses = interesService.countTotalIntereses();
        double[] interesesArray = new double[(int) totalIntereses]; // Se asume que totalIntereses es siempre un valor razonable para convertir a int
        Arrays.fill(interesesArray, 0); // Inicializa con 0

        for (ClienteInteresDTO clienteInteresDTO : interesesDTO) {
            int index = clienteInteresDTO.getInteresId().intValue() - 1; // Ajuste para índice de array
            interesesArray[index] = clienteInteresDTO.getPonderacion();
        }

        return interesesArray;
    }


    private double calcularDistanciaEuclidiana(double[] interesesCliente1, double[] interesesCliente2) {
        // Código para calcular la distancia euclidiana...
        if (interesesCliente1.length != interesesCliente2.length) {
            throw new IllegalArgumentException("Los arrays deben tener la misma longitud");
        }

        double suma = 0.0;
        for (int i = 0; i < interesesCliente1.length; i++) {
            suma += Math.pow(interesesCliente1[i] - interesesCliente2[i], 2);
        }
        return Math.sqrt(suma);
    }
}
