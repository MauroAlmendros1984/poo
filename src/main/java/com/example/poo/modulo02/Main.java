package com.example.poo.modulo02;

public class Main {
    public static void main(String[] args) {
        Juan juan = new Juan();
        Firulais firulais = new Firulais();

        juan.asignarMascota(new Firulais());
        firulais.establecerDuenio(juan);

        System.out.println("Juan tiene una mascota: " + juan.getMascota());
        System.out.println("Firulais tiene un dueño: " + firulais.getDuenio());
    }
}
