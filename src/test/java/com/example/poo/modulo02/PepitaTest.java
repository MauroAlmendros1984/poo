package com.example.poo.modulo02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PepitaTest {

    @Test
    void testVolar() {
        Pepita pepita = new Pepita();
        assertEquals(pepita.volar(),90);
    }

    @Test
    void testComer() {
        Pepita pepita = new Pepita();
        assertEquals(pepita.comer(10),210);
    }

    @Test
    void getEnergia() {
        Pepita pepita = new Pepita();
        assertEquals(pepita.getEnergia(),100);
    }

    @Test
    void setEnergia() {
        Pepita pepita = new Pepita();
        pepita.setEnergia(101);
        assertEquals(pepita.getEnergia(),101);
    }
}
