package com.example.poo.modulo16;

public class ComplejidadMedia extends Complejidad {
    @Override
    public double costoExtra(double tiempo, double costoBase) {
        return 0.05 * costoBase;
    }

    public double diasAtraso(Tarea tarea) {
        return 1.1 * tarea.getTiempo();
    }
}
