package com.example.poo.modulo16;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Tarea {
    private Complejidad complejidad;
    private int tiempo;
    private final List<Impuesto> impuestos = new ArrayList<>();

    public Tarea(Complejidad complejidad, int tiempo) {
        this.complejidad = complejidad;
        this.tiempo = tiempo;
    }

    public void agregarImpuesto(Impuesto impuesto) {
        impuestos.add(impuesto);
    }

    public void cumplir() {
    }

    public double costo() {
        double costoBase = complejidad.costo(this);
        return costoBase + costoPorOverhead() + costoImpositivo(costoBase);
    }

    public double costoComplejidad() {
        return complejidad.costo(this);
    }

    public double diasAtraso() {
        return complejidad.diasAtraso(this);
    }

    protected double costoPorOverhead() {
        return 0;
    }

    private double costoImpositivo(double costoBase) {
        double costoImpuestos = 0;
        for (Impuesto impuesto : impuestos) {
            costoImpuestos += impuesto.calcularValor(costoBase);
        }
        return costoImpuestos;
    }

    public int getTiempo() {
        return tiempo;
    }

    protected double porcentajeCumplimiento() {
        return 0;
    }
}
