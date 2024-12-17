package com.example.poo.modulo16;

import java.util.ArrayList;
import java.util.List;

public class TareaCompuesta extends Tarea {
    private final List<Tarea> subtareas = new ArrayList<>();

    public TareaCompuesta(Complejidad complejidad, int tiempo) {
        super(complejidad, tiempo);
    }


    @Override
    public void cumplir() {
        throw new UnsupportedOperationException("Solo puede marcar como cumplida una tarea simple");
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    @Override
    protected double costoPorOverhead() {
        if (tieneMuchasSubtareas()) {
            return costoComplejidad() * 0.04;
        } else {
            return 0;
        }
    }

    private boolean tieneMuchasSubtareas() {
        return subtareas.size() > 3;
    }

    public double costoTotal() {
        double costoTotal = 0;
        for (Tarea tarea : subtareas) {
            costoTotal += tarea.costo();
        }
        return costoTotal;
    }

    public double porcentajeCumplimiento() {
        double sumaPorcentajes = 0;
        for (Tarea subtarea : subtareas) {
            sumaPorcentajes += subtarea.porcentajeCumplimiento();
        }
        return sumaPorcentajes / subtareas.size();
    }
}
