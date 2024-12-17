package com.example.poo.modulo16;

abstract class Complejidad {
    public double costoBase(Tarea tarea) {
        return tarea.getTiempo() * 25;
    }

    public double costo(Tarea tarea) {
        double costoBase = costoBase(tarea);
        return costoBase + costoExtra(tarea.getTiempo(), costoBase);
    }

    public double costoExtra(double tiempo, double costoBase) {
        return 0;
    }

    public double diasAtraso(Tarea tarea) {
        return 0;
    }
}
