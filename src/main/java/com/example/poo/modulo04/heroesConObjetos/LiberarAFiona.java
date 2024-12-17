package com.example.poo.modulo04.heroesConObjetos;

public class LiberarAFiona extends Mision {
    private int cantidadTrolls;

    public LiberarAFiona(int cantidadTrolls) {
        this.cantidadTrolls = cantidadTrolls;
    }

    @Override
    public String solicitante() {
        return "Lord Farquaad";
    }

    @Override
    public boolean esDificil() {
        return cantidadTrolls >= 4 && cantidadTrolls <= 5;
    }

    @Override
    public int puntosRecompensa() {
        return cantidadTrolls * 2;
    }
}

