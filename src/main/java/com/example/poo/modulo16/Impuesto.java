package com.example.poo.modulo16;

public class Impuesto {
    private final double porcentaje;

    public Impuesto(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularValor(double costo) {
        return costo * porcentaje / 100;
    }
}