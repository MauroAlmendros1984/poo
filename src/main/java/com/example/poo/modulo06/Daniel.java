package com.example.poo.modulo06;


public class Daniel {
    public boolean llevaA(Pasajero pasajero) {
        return !pasajero.esJoven();
    }

    public boolean llevaA(boolean esJoven) {
        return esJoven;
    }
}
