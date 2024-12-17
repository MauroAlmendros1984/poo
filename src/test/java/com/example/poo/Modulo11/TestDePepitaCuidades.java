package com.example.poo.Modulo11;

import com.example.poo.modulo11.Ciudad;
import com.example.poo.modulo11.Pepita;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDePepitaCuidades {

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
        realizarViajeLoco();
        assertFalse(pepita.esFavorita(campana));
    }

    @Test
    public void testPepitaCumpleSuDeseoAlVolarQuedaConMenosEnergia() {
        pepita.cumplirDeseo();
        assertEquals(85, pepita.getEnergia());
    }

    @Test
    public void testPepitaHaceSuViajeLocoYQuedaConEnergia4() {
        realizarViajeLoco();
        assertEquals(4, pepita.getEnergia());
    }

    private void realizarViajeLoco() {
        Ciudad quilmes = new Ciudad(1);
        pepita.cumplirDeseo();
        pepita.agregarCiudad(quilmes);
        pepita.cumplirDeseo();
        pepita.cumplirDeseo();
    }
}
