package com.example.poo.modulo08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LaminaTest {

    @Test
    void testPrecio() {
        Lamina laGioconda = new Lamina();
        laGioconda.determinePrecio();
        double expectedPrice = laGioconda.alto * laGioconda.ancho * laGioconda.determinePrecioBase();
        assertEquals(expectedPrice, laGioconda.precio);
    }

    @Test
    void testEsCaro() {
        Lamina lamina = new Lamina();
        assertFalse(lamina.esCaro()); // Depende del valor retornado por material.precio()
    }
}
