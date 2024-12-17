package com.example.poo.modulo07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dodge1500Test {

    @Test
    void getKilometraje() {
        Dodge1500 dodge1500 = new Dodge1500();
        Integer kilometraje = dodge1500.getKilometraje();
        assertEquals(kilometraje, 150000);
    }


    @Test
    void getColor() {
        Dodge1500 dodge1500 = new Dodge1500();
        String color = dodge1500.getColor();
        assertEquals("bordo", color);
    }

    @Test
    void isConAire() {
        Dodge1500 dodge1500 = new Dodge1500();
        assertEquals(dodge1500.isConAire(),false);
    }

    @Test
    void getPatente() {
        Dodge1500 dodge1500 = new Dodge1500();
        String Patente = dodge1500.getPatente();
        assertEquals(Patente, "RVM 363");
    }

    @Test
    void getAnioPatentamiento() {
        Dodge1500 dodge1500 = new Dodge1500();
        Integer anioPatentamiento = dodge1500.getAnioPatentamiento();
        assertEquals(anioPatentamiento, 1979);
    }

    @Test
    void setColor() {
        Dodge1500 dodge1500 = new Dodge1500();
        String color = dodge1500.getColor();
        assertEquals(color, "bordo");
    }

    @Test
    void setKilometraje() {
        Dodge1500 dodge1500 = new Dodge1500();
        Integer kilometraje = dodge1500.getKilometraje();
        assertEquals(kilometraje, 150000);
    }

    @Test
    void setConAire() {
        Dodge1500 dodge1500 = new Dodge1500();
        dodge1500.setConAire(true);
        assertTrue(dodge1500.isConAire());
    }

    @Test
    void realizarViaje() {
        Dodge1500 dodge1500 = new Dodge1500();
        dodge1500.realizarViaje(100);
        assertEquals(dodge1500.getKilometraje(),150100);
    }

}