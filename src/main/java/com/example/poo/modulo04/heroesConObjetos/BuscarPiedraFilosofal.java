package com.example.poo.modulo04.heroesConObjetos;

public class BuscarPiedraFilosofal extends Mision {
    private int kilometrosDistancia;

    public BuscarPiedraFilosofal(int kilometrosDistancia) {
        this.kilometrosDistancia = kilometrosDistancia;
    }

    @Override
    public String solicitante() {
        return "Mr DumblecofcofDore";
    }

    @Override
    public boolean esDificil() {
        return kilometrosDistancia > 100;
    }

    @Override
    public int puntosRecompensa() {
        return (kilometrosDistancia > 50) ? 10 : 5;
    }
}
