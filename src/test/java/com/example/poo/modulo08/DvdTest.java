package com.example.poo.modulo08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DvdTest {

    @Test
    void testPrecio() {
        Dvd jurassicPark = new Dvd();
        jurassicPark.precio();
        assertEquals(900, jurassicPark.precio); // precioMinuto (10) * cantidadMinutos (90)
    }

    @Test
    void testEsCaro() {
        Dvd dvd = new Dvd();
        dvd.precio(); // Esto establece el precio
        assertTrue(dvd.precio > 100);
    }
}
