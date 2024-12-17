package com.example.poo.modulo16;


public class TareaSimple extends Tarea {
    private int porcentajeCumplimiento;

    public TareaSimple(Complejidad complejidad, int tiempo) {
        super(complejidad, tiempo);
    }


    @Override
    protected double costoPorOverhead() {
        return 0;
    }

    @Override
    public void cumplir() {
        porcentajeCumplimiento = 100;
    }

    public double costoTotal() {
        return costo();
    }
}

