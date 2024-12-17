package com.example.poo.modulo12.dictionaryTotales;

import java.time.LocalDate;

public class Rendicion {
    private final String persona;
    private final LocalDate fecha;
    private final int total;

    public Rendicion(String persona, LocalDate fecha, int total) {
        this.persona = persona;
        this.fecha = fecha;
        this.total = total;
    }

    // Getters
    public String getPersona() {
        return persona;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getTotal() {
        return total;
    }
}
