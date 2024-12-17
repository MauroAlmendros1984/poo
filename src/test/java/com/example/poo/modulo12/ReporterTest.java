package com.example.poo.modulo12;

import com.example.poo.modulo12.dictionaryTotales.Rendicion;
import com.example.poo.modulo12.dictionaryTotales.Reporter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporterTest {

    private Reporter reporter;


    @BeforeEach
    public void setUp() {
        reporter = new Reporter();
        LocalDate hoy = LocalDate.now();
        reporter.agregarRendicion(new Rendicion("Juan", hoy, 100));
        reporter.agregarRendicion(new Rendicion("Juan", hoy.minusMonths(1), 250));
        reporter.agregarRendicion(new Rendicion("Juan", hoy.minusDays(1), 120));
        reporter.agregarRendicion(new Rendicion("Ricky", hoy, 500));
        reporter.agregarRendicion(new Rendicion("Ricky", hoy.minusDays(2), 50));
    }

    @Test
    public void testTotalesPorCliente() {
        Map<String, Integer> totales = reporter.totalPorCliente();

        assertEquals(470, totales.get("Juan"));
        assertEquals(550, totales.get("Ricky"));
    }

    @Test
    public void testTotalesPorFecha() {
        Map<LocalDate, Integer> totales = reporter.totalPorFecha();

        // Asumiendo que "hoy" es la fecha actual cuando se ejecutan estas pruebas
        LocalDate hoy = LocalDate.now();
        assertEquals(600, totales.get(hoy));
        assertEquals(120, totales.get(hoy.minusDays(1)));
        assertEquals(50, totales.get(hoy.minusDays(2)));
        assertEquals(250, totales.get(hoy.minusMonths(1)));
    }
}
