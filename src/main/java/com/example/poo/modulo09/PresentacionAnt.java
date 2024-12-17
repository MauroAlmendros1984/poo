package com.example.poo.modulo09;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PresentacionAnt {
    private String lugar;
    private final List<String> musicos;
    private double valorEntrada;
    private int entradasVendidas;

    public PresentacionAnt(String lugar, List<String> musicos, double valorEntrada, int entradasVendidas) {
        this.lugar = lugar;
        this.musicos = musicos;
        this.valorEntrada = valorEntrada;
        this.entradasVendidas = entradasVendidas;
    }
}