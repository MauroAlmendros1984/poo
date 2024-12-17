package com.example.poo.modulo06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDaniel {

    @Test
    public void testDanielNoLlevaAPasajeroJoven() {
        Pasajero pasajeroJoven = new Pasajero(true);
        Daniel daniel = new Daniel();
        assertFalse(daniel.llevaA(pasajeroJoven));
    }

    @Test
    public void testDanielLlevaAPasajeroQueNoEsJoven() {
        Pasajero pasajeroViejo = new Pasajero(false);
        Daniel daniel = new Daniel();
        assertTrue(daniel.llevaA(pasajeroViejo));
    }

    @Test
    public void testDanielNoLlevaAPasajeroJovenMagali() {
        Magali magali = new Magali();
        Daniel daniel = new Daniel();
        assertTrue(daniel.llevaA(magali.esJoven()));
    }
}
