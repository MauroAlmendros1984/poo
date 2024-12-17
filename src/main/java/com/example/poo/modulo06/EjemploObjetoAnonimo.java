package com.example.poo.modulo06;

public class EjemploObjetoAnonimo {
    public static void main(String[] args) {
        // Suma
        Calculadora suma = new Calculadora() {
            @Override
            public double operacion(double a, double b) {
                return a + b;
            }
        };

        // Resta
        Calculadora resta = new Calculadora() {
            @Override
            public double operacion(double a, double b) {
                return a - b;
            }
        };

        // Multiplicación
        Calculadora multiplicacion = new Calculadora() {
            @Override
            public double operacion(double a, double b) {
                return a * b;
            }
        };

        // División
        Calculadora division = new Calculadora() {
            @Override
            public double operacion(double a, double b) {
                if (b == 0) {
                    throw new ArithmeticException("¡No se puede dividir por cero!");
                }
                return a / b;
            }
        };

        // Usando las implementaciones de la interfaz
        System.out.println("Suma: " + suma.operacion(5, 3));
        System.out.println("Resta: " + resta.operacion(5, 3));
        System.out.println("Multiplicación: " + multiplicacion.operacion(5, 3));
        System.out.println("División: " + division.operacion(6, 3));
    }
}
