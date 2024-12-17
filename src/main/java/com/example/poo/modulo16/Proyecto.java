package com.example.poo.modulo16;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private final List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public double costoTotal() {
        double costoTotal = 0;
        for (Tarea tarea : tareas) {
            costoTotal += tarea.costo();
        }
        return costoTotal;
    }

    public double diasMaximosDeAtraso() {
        double maxDiasAtraso = 0;
        for (Tarea tarea : tareas) {
            double diasAtraso = tarea.diasAtraso();
            if (diasAtraso > maxDiasAtraso) {
                maxDiasAtraso = diasAtraso;
            }
        }
        return maxDiasAtraso;
    }
}