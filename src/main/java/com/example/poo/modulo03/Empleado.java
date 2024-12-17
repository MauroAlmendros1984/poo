package com.example.poo.modulo03;

public class Empleado {
    private String nombre;
    private int salarioBase;

    public Empleado(String nombre, int salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public int sueldo() {
        // Puedes agregar lógica adicional aquí para calcular el sueldo según tus necesidades
        System.out.println(salarioBase);
        return salarioBase;
    }

    public String getNombre() {
        System.out.println(nombre);

        return nombre;
    }
}
