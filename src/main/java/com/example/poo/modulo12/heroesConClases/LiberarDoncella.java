package com.example.poo.modulo12.heroesConClases;

public class LiberarDoncella implements Mision {
    private String solicitante = "";
    private final int cantidadTrolls;

    public LiberarDoncella(int cantidadTrolls) {
        this.cantidadTrolls = cantidadTrolls;
    }

    @Override
    public boolean esDificil() {
        return cantidadTrolls >= 4 && cantidadTrolls <= 5;
    }

    @Override
    public int puntosRecompensa() {
        return cantidadTrolls * 2;
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
