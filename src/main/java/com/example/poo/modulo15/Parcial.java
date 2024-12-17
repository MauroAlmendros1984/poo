package com.example.poo.modulo15;

class Parcial {
    private int cantidadPreguntas;

    public Parcial(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }

    public boolean esDificil() {
        return cantidadPreguntas > 5;
    }
}
