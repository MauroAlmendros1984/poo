package com.example.poo.modulo08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void testEsCaro() {
        Libro elPrincipito = new Libro();
        elPrincipito.aumentar(80);
        assertEquals(180, elPrincipito.getPrecio());
        assertTrue(elPrincipito.getPrecio() > 150);
    }

    @Test
    void testNoEsCaro() {
        Libro martinFierro = new Libro();
        martinFierro.aumentar(50);
        assertEquals(150, martinFierro.getPrecio());
        assertFalse(martinFierro.getPrecio() > 150);
    }

}
