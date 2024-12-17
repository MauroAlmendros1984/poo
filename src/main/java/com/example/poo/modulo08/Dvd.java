package com.example.poo.modulo08;

public class Dvd implements Costeable {
    public Integer precio = 0;
    public Integer precioMinuto = 10;
    public Integer cantidadMinutos = 90;

    public void precio() {
        precio = precioMinuto * cantidadMinutos;
        System.out.println(precio);
    }

    @Override
    public boolean esCaro() {
        return precio > 100;
    }
}
