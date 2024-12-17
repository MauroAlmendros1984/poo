package com.example.poo.modulo09;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Ave camoran = new Ave();
        camoran.volar(1);

        Presentacion vamosAVerQuienEnLuna = new Presentacion("Luna Park",
                100);

        PresentacionAnt seruEnObras = new PresentacionAnt("Luna Park",
                Collections.singletonList("Charly, David, Pedro, Oscar"),
                100,
                1);
    }
}
