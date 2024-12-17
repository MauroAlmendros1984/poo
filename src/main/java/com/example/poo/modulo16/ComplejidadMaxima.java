package com.example.poo.modulo16;

class ComplejidadMaxima extends Complejidad {
    @Override
    public double costoExtra(double tiempo, double costoBase) {
        return costoBase * 0.07 + costoAdicionalPorRetraso(tiempo);
    }

    public double costoAdicionalPorRetraso(double tiempo) {
        return 10 * Math.max(0, tiempo - 10);
    }

    public double diasAtraso(Tarea tarea) {
        return 1.2 * tarea.getTiempo() + 8;
    }
}
