package com.example.poo.modulo13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GolondrinaTest {

    @Test
    void volar() {
        Golondrina golondrina = new Golondrina();
        golondrina.volar(50);
        assertEquals(40, golondrina.getEnergia());
    }

    @Test
    void comer() {
        Golondrina golondrina = new Golondrina();
        Comida comida = new Alpiste();
        golondrina.comer(comida);
        assertEquals(100, golondrina.getEnergia());
    }
}
