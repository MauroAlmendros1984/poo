package com.example.poo.modulo02;

public class Firulais extends Mascota{
    private Juan duenio;

    public void establecerDuenio(Juan nuevoDuenio) {
        duenio = nuevoDuenio;
    }

    public Juan getDuenio() {
        return duenio;
    }
}
