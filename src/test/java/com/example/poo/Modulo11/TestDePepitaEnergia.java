package com.example.poo.Modulo11;

import com.example.poo.modulo11.Ciudad;
import com.example.poo.modulo11.Pepita;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDePepitaEnergia {

    private Pepita pepita;

    @BeforeEach
    public void initialize() {
        pepita = new Pepita(100);
    }

    @Test
    public void testPepitaComienzaCon100UnidadesDeEnergia() {
        assertEquals(100, pepita.getEnergia());
    }

    @Test
    public void testPepitaComienzaSiendoFuerte() {
        assertTrue(pepita.esFuerte());
    }

    @Test
    public void testPepitaVuelaACiudadConConsumoMayorACeroYEseConsumoLeQuitaEnergia() {
        Ciudad sanMartin = new Ciudad(5);
        pepita.volar(sanMartin);
        assertEquals(85, pepita.getEnergia());
    }

    @Test
    public void testCuandoPepitaComeSuEnergiaBaja() {
        pepita.comer(120);
        assertEquals(580, pepita.getEnergia());
    }

    @Test
    public void testPepitaVuelaACiudadQueNoTieneConsumoLaEnergiaBajaUnValorConstante() {
        Ciudad ciudadSinConsumo = new Ciudad(0);
        pepita.volar(ciudadSinConsumo);
        assertEquals(90, pepita.getEnergia());
    }

    @Test
    public void testPepitaCome0GramosYLaEnergiaSeMantiene() {
        pepita.comer(0);
        assertEquals(100, pepita.getEnergia());
    }

    @Test
    public void testPepitaVuelaACiudadQueLeConsumeMuchoYaNoEsFuerte() {
        Ciudad campana = new Ciudad(60);
        pepita.volar(campana);
        assertFalse(pepita.esFuerte());
    }
}
