package com.example.poo.modulo16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProyecto {

    @Test
    public void testCostoTareaSimpleSinImpuestos() {
        ComplejidadMinima complejidad = new ComplejidadMinima();
        TareaSimple tarea = new TareaSimple(complejidad, 4);
        double costoEsperado = complejidad.costoBase(tarea);
        double costoReal = tarea.costo();
        assertEquals(costoEsperado, costoReal, 0.001);
    }

    @Test
    public void testDiasAtrasoTarea() {
        ComplejidadMinima complejidad = new ComplejidadMinima();
        TareaSimple tarea = new TareaSimple(complejidad, 2);
        double diasAtrasoEsperados = complejidad.diasAtraso(tarea);
        double diasAtrasoReales = tarea.diasAtraso();
        assertEquals(diasAtrasoEsperados, diasAtrasoReales, 0.001);
    }

    @Test
    public void testCostoProyecto() {
        ComplejidadMinima complejidadMinima = new ComplejidadMinima();
        ComplejidadMedia complejidadMedia = new ComplejidadMedia();
        ComplejidadMaxima complejidadMaxima = new ComplejidadMaxima();
        Impuesto impuestoA = new Impuesto(3);
        Impuesto impuestoB = new Impuesto(5);

        TareaSimple escribirTests = new TareaSimple(complejidadMinima, 4);
        TareaCompuesta programarTP0 = new TareaCompuesta(complejidadMinima, 10);
        TareaSimple armarFixture = new TareaSimple(complejidadMinima, 2);
        TareaSimple programarObjetoPepita = new TareaSimple(complejidadMedia, 1);
        TareaSimple programarObjetoPepona = new TareaSimple(complejidadMaxima, 2);
        Proyecto darClase = new Proyecto();

        programarTP0.agregarSubtarea(armarFixture);
        programarTP0.agregarSubtarea(escribirTests);
        programarTP0.agregarSubtarea(programarObjetoPepita);
        programarTP0.agregarSubtarea(programarObjetoPepona);

        armarFixture.agregarImpuesto(impuestoA);
        armarFixture.agregarImpuesto(impuestoB);

        darClase.agregarTarea(escribirTests);
        darClase.agregarTarea(programarObjetoPepita);

        assertEquals(126.25, darClase.costoTotal(), 0.001);
    }
}
