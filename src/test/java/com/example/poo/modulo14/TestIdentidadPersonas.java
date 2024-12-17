package com.example.poo.modulo14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIdentidadPersonas {

    Persona alumno, chiara, melina;


    @BeforeEach
public void setUp() {
    alumno = new Persona("Luciano", "Centenera 83");
    chiara = new Persona("Chiara", "Nazca 3143");
    melina = new Persona("Melina", "Nazca 3143");
}

    @Test
    public void testAsignacionReferenciaIgualdadObjetos() {
        Persona luciano = alumno;
        assertEquals(alumno, luciano);
    }

    @Test
    public void testIgualdadDomicilios() {
        assertEquals(chiara.getDomicilio(), melina.getDomicilio());
    }

    @Test
    public void testVivenJuntosCon() {
        assertTrue(chiara.vivenJuntosCon(melina));
    }

}
