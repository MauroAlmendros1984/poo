package com.example.poo.modulo12.heroesConClases;

public class BuscarItemMagico implements Mision {
    private String solicitante = "";
    private final int kilometrosDistancia;

    public BuscarItemMagico(int kms) {
        this.kilometrosDistancia = kms;
    }

    @Override
    public boolean esDificil() {
        return kilometrosDistancia > 100;
    }

    @Override
    public int puntosRecompensa() {
        return kilometrosDistancia > 50 ? 10 : 5;
    }

    @Override
    public String getSolicitante() {
        return solicitante;
    }

    @Override
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
}
