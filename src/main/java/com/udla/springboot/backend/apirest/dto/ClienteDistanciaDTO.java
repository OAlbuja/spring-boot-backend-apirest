package com.udla.springboot.backend.apirest.dto;

public class ClienteDistanciaDTO {
    private Long clienteId; // ID del cliente en lugar de ClienteDTO
    private double distancia;

    // Constructor
    public ClienteDistanciaDTO(Long clienteId, double distancia) {
        this.clienteId = clienteId;
        this.distancia = distancia;
    }

    // Getters y setters
    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Otros métodos como toString(), hashCode(), equals() si son necesarios
}
