package com.tempoquito.springboot.backend.apirest.Utils;

public class ValidationUtils {

    /**
     * Comprueba si el número de cédula ingresado es valido.
     * @param  ci Número de cédula
     * @return Boolean
     */
    public static boolean isValidCI(String ci) {
        int total = 0;
        int individual;
        boolean isNumeric = true;

        for (int position = 0; position < 10; position++) {
            // Obtiene cada posición del número de cédula
            individual = Character.getNumericValue(ci.charAt(position));

            if (individual < 0) {
                isNumeric = false;
                break;
            } else {
                // Si la posición es menor a 9
                if (position < 9) {
                    // Si la posición es par
                    if (position % 2 == 0) {
                        individual *= 2;
                        if (individual > 9) {
                            individual -= 9;
                        }
                    }
                    total += individual;
                }
            }
        }

        if (isNumeric) {
            total = total % 10;
            total = total == 0 ? 0 : 10 - total;

            // El último dígito de la cédula debe coincidir con el resultado
            return total == Character.getNumericValue(ci.charAt(9));
        }

        return false;
    }
}
