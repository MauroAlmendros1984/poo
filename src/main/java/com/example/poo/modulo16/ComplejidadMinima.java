package com.example.poo.modulo16;

public class ComplejidadMinima extends Complejidad {
    @Override
    public double costoExtra(double tiempo, double costoBase) {
        return 0;
    }

    public double diasAtraso(Tarea tarea) {
        return 5;
    }
}
