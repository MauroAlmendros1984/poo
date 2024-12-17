package com.example.poo.modulo03;

public class Baigorria  extends Empleado  {
    private int cantidadEmpanadasVendidas = 100;
    private int montoPorEmpanada = 15;

    public Baigorria() {
        super("Baigorria", 0);
    }

    public void venderEmpanada() {
        cantidadEmpanadasVendidas = cantidadEmpanadasVendidas + 1;
        System.out.println(cantidadEmpanadasVendidas);
    }

    @Override
    public int sueldo() {
        int sueldoComision = cantidadEmpanadasVendidas * montoPorEmpanada;

        System.out.println(sueldoComision);

        return sueldoComision;
    }
}

