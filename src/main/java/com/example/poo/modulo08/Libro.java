package com.example.poo.modulo08;

public class Libro implements Costeable {
    public Integer precio = 100;

    @Override
    public boolean esCaro() {
        return precio > 150;
    }

    public void aumentar(int aumento) {
        precio += aumento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
