package com.example.poo.modulo13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorcazaTest {

    @Test
    void comer() {
        Torcaza torcaza = new Torcaza();
        torcaza.comer(10);
        assertEquals(79, torcaza.getEnergia());
    }
}
