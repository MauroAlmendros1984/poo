package com.example.poo.modulo08;

public class Main {
    public static void main(String[] args) {
    Libro elPrincipito = new Libro();
    elPrincipito.aumentar(80);
    elPrincipito.esCaro();

    Libro martinFierro = new Libro();
    martinFierro.aumentar(50);
    martinFierro.esCaro();

    Libro elReinoDelReves = new Libro();
    elReinoDelReves.aumentar(100);
    elReinoDelReves.esCaro();

    Dvd jurassicPark = new Dvd();
    jurassicPark.precio();

    Lamina laGioconda = new Lamina();
    laGioconda.determinePrecio();
    }
}
