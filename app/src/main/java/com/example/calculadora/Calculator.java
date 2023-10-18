package com.example.calculadora;

/**
 * La clase Calculator proporciona un método para realizar cálculos simples.
 * Puede realizar operaciones de suma, resta y multiplicación.
 */
public class Calculator {


    /**
     * Calcula el resultado de una expresión matemática dentro de una cadena de texto.
     *
     * @param cadena La cadena que contiene la expresión matemática que calcular
     * @return El resultado de la operacion como una cadena de texto. Si la expresión introducida no es válida
     *         o no se puede calcular, devuelve "-1".
     */
    public static String calculate(String cadena) {
        int numIzquierda;
        int numDerecha;
        int lastIndex;
        char operador;

        // Comprueba que la cadena introducida sea una expresion válida
        if (!cadena.startsWith("*") && !cadena.contains("++") && !cadena.contains("--") && !cadena.contains("**")) {
            try {
                if (!cadena.contains("*") && !cadena.contains("+") && !cadena.contains("-")) {
                    return cadena;

                } else {
                    // Encuentra el último operador de la cadena
                    lastIndex = cadena.lastIndexOf("+");
                    if (lastIndex == -1) {
                        lastIndex = cadena.lastIndexOf("-");
                    }
                    if (lastIndex == -1) {
                        lastIndex = cadena.lastIndexOf("*");
                    }

                    if (lastIndex != -1) {
                        operador = cadena.charAt(lastIndex);
                        String izquierda = cadena.substring(0, lastIndex);
                        String derecha = cadena.substring(lastIndex + 1);

                        numIzquierda = Integer.parseInt(calculate(izquierda));
                        numDerecha = Integer.parseInt(calculate(derecha));

                        // Realiza la operación en funcion del signo del operador
                        if (operador == '+') {
                            return String.valueOf(numIzquierda + numDerecha);
                        } else if (operador == '-') {
                            return String.valueOf(numIzquierda - numDerecha);
                        } else if (operador == '*') {
                            return String.valueOf(numIzquierda * numDerecha);
                        }
                    }
                }

            }catch(Exception e){
                return String.valueOf(-1);
            }
        }

        return String.valueOf(-1);
    }
}