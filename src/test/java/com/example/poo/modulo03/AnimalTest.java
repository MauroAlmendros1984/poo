package com.example.poo.modulo03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void hacerSonido() {
        Animal miMascota1 = new Perro();
        Animal miMascota2 = new Gato();

        String mascota1 = miMascota1.hacerSonido();
        String mascota2 = miMascota2.hacerSonido();

        assertEquals(mascota1, "El perro ladra");
        assertEquals(mascota2, "El gato maulla");

    }
}