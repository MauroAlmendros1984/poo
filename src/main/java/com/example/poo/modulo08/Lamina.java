package com.example.poo.modulo08;

public class Lamina implements Costeable {
    public double precio = 0;

    protected double ancho = 29.7;
    protected double alto = 42;
    private Material material = new Material();

    public void determinePrecio() {
        precio =  alto * ancho * determinePrecioBase();
        System.out.println(precio);

    }

    @Override
    public boolean esCaro() {
        return determinePrecioBase() > 50;
    }

    public double determinePrecioBase() {
        return material.precio();
    }
}
