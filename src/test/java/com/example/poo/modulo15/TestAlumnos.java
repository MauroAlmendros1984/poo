package com.example.poo.modulo15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAlumnos {

    @Test
    public void testAlumnoEstudiosoEstudiaSiempre() {
        Alumno alumnoEstudioso = new Alumno();
        Parcial parcial = new Parcial(5);

        assertTrue(alumnoEstudioso.estudiaPara(parcial));
    }

    @Test
    public void testAlumnoVagoNoEstudiaSiLeFueBien() {
        Alumno vagoQueLeFueBien = new Alumno();
        vagoQueLeFueBien.rendir(9);
        Parcial parcial = new Parcial(5);

        assertTrue(vagoQueLeFueBien.estudiaPara(parcial));
    }

    @Test
    public void testAlumnoVagoEstudiaSiLeFueMal() {
        Alumno vagoQueLeFueMal = new Alumno();
        vagoQueLeFueMal.rendir(2);
        Parcial parcial = new Parcial(5);

        assertTrue(vagoQueLeFueMal.estudiaPara(parcial));
    }

    @Test
    public void testAlumnoHijoDelRigorNoEstudiaParaParcialFacil() {
        Alumno alumnoHijoDelRigor = new Alumno();
        Parcial parcialFacil = new Parcial(3);

        assertTrue(alumnoHijoDelRigor.estudiaPara(parcialFacil));
    }

    @Test
    public void testAlumnoHijoDelRigorEstudiaParaParcialDificil() {
        Alumno alumnoHijoDelRigor = new Alumno();
        Parcial parcialDificil = new Parcial(8);

        assertTrue(alumnoHijoDelRigor.estudiaPara(parcialDificil));
    }
}
