package com.example.poo.modulo05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PepitaTest {

    @Test
    public void testEnergiaInicialDePepita() {
        Pepita pepita = new Pepita();
        assertEquals(100, pepita.getEnergia());
    }

    @Test
    public void testPepitaComienzaSiendoFuerte() {
        Pepita pepita = new Pepita();
        assertTrue(pepita.esFuerte());
    }

    @Test
    public void testPepitaVuelaYBajaSuEnergia() {
        Pepita pepita = new Pepita();
        pepita.volar(5);
        assertEquals(85, pepita.getEnergia());
    }

    @Test
    public void testPepitaComeYSubeSuEnergia() {
        Pepita pepita = new Pepita();
        pepita.comer(120);
        assertEquals(580, pepita.getEnergia());
    }

    @Test
    public void testPepitaEmpiezaAVolarNoVuelaYLaEnergiaBaja() {
        Pepita pepita = new Pepita();
        pepita.volar(0);
        assertEquals(90, pepita.getEnergia());
    }

    @Test
    public void testPepitaCome0GramosYLaEnergiaSeMantiene() {
        Pepita pepita = new Pepita();
        pepita.comer(0);
        assertEquals(100, pepita.getEnergia());
    }

    @Test
    public void testPepitaVuelaMuchosKilometrosYaNiEsFuerte() {
        Pepita pepita = new Pepita();
        pepita.volar(60);
        assertFalse(pepita.esFuerte());
    }

    @Test
    public void testPepitaVuelaPocosKilometrosYaNiEsFuerte() {
        Pepita pepita = new Pepita();
        pepita.volar(40);
        assertFalse(pepita.esFuerte());
    }
}
