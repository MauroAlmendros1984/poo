package com.example.poo.modulo04.heroesConObjetos;



public class Main {
    public static void main(String[] args) {
        Shrek shrek = new Shrek();
        shrek.agregarMision(new LiberarAFiona(4));
        shrek.agregarMision(new BuscarPiedraFilosofal(40));

        System.out.println("Cantidad de misiones: " + shrek.cantidadDeMisiones());
        System.out.println("Misiones difíciles: " + shrek.misionesDificiles());
        System.out.println("Solicitantes de mis misiones: " + shrek.solicitantesDeMisMisiones());
        System.out.println("Total puntos de recompensa: " + shrek.totalPuntosDeRecompensa());
    }
}