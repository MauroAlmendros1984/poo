package com.example.poo.Modulo11;


import com.example.poo.modulo11.Ciudad;
import com.example.poo.modulo11.Pepita;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsDePepita {

    private Pepita pepita;
    private Ciudad campana;
    private Ciudad sanMartin;

    @BeforeEach
    public void initialize() {
        pepita = new Pepita(100);
        campana = new Ciudad(60);
        sanMartin = new Ciudad(5);
        pepita.agregarCiudad(campana);
        pepita.agregarCiudad(sanMartin);
    }

    @Test
    public void testPepitaComienzaCon100UnidadesDeEnergia() {
        assertEquals(100, pepita.getEnergia());
    }

    @Test
    public void testPepitaComienzaSiendoFuerte() {
        Assertions.assertTrue(pepita.esFuerte());
    }

    @Test
    public void testPepitaVuelaACiudadConConsumoMayorACeroYEseConsumoLeQuitaEnergia() {
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
        pepita.volar(campana);
        assertFalse(pepita.esFuerte());
    }

    @Test
    public void testPepitaCumpleSuDeseoAlVolarQuedaConMenosEnergia() {
        pepita.cumplirDeseo();
        assertEquals(85, pepita.getEnergia());
    }

    @Test
    public void testPepitaHaceSuViajeLocoYQuedaConEnergia4() {
        viajeLoco();
        assertEquals(4, pepita.getEnergia());
    }

    @Test
    public void testAlInicioPepitaTieneASanMartinPorCiudadFavorita() {
        assertTrue(pepita.esFavorita(sanMartin));
    }

    @Test
    public void testPepitaCumpleSuDeseoYCampanaDejaDeSerCiudadFavorita() {
        pepita.cumplirDeseo();
        assertFalse(pepita.esFavorita(sanMartin));
        assertTrue(pepita.esFavorita(campana));
    }

    @Test
    public void testPepitaHaceSuViajeLocoYNoTieneACampanaComoFavorita() {
        viajeLoco();
        assertFalse(pepita.esFavorita(campana));
    }

    private void viajeLoco() {
        Ciudad quilmes = new Ciudad(1);
        pepita.cumplirDeseo();
        pepita.agregarCiudad(quilmes);
        pepita.cumplirDeseo();
        pepita.cumplirDeseo();
    }
}
