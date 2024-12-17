package com.example.poo.modulo09;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Presentacion {
    private String lugar;
    private final List<String> musicos = new ArrayList<>();
    private double valorEntrada;
    private int entradasVendidas = 0;

    public Presentacion(String lugar, double valorEntrada) {
        this.lugar = lugar;
        this.valorEntrada = valorEntrada;
    }
}
