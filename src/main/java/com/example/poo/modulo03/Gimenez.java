package com.example.poo.modulo03;

public class Gimenez {
    private int dinero = 0;

    public int getDinero() {
        return dinero;
    }

    public void pagarA(Empleado empleado) {
        dinero -= empleado.sueldo();
        System.out.println(dinero);
    }
}
