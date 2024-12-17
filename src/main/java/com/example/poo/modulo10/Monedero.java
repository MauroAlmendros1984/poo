package com.example.poo.modulo10;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Monedero {
    public double plata = 500;
    private int depositosHoy = 0;
    private double montoExtraidoHoy = 0;
    private LocalDate ultimaFecha = null;

    public void poner(int cantidad) {
        validarMontoPositivo(cantidad);
        validarLimiteDepositosDiarios();
        plata += cantidad;
        depositosHoy++;
        ultimaFecha = LocalDate.now();
    }

    public void sacar(int cantidad) throws Exception {
        validarMontoPositivo(cantidad);
        validarLimiteExtraccionDiaria(cantidad); //Este arroja una chequeda por eso el metodo incluye excepcion en la firma
        if (cantidad > plata) {
            throw new RuntimeException("Debe retirar menos de " + plata); //Excepcion NO chequeda
        }
        plata -= cantidad;
        montoExtraidoHoy += cantidad;
        ultimaFecha = LocalDate.now();
    }

    private void validarMontoPositivo(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva"); //Excepcion NO chequeda
        }
    }

    private void validarLimiteDepositosDiarios() {
        if (ultimaFecha != null && ultimaFecha.equals(LocalDate.now()) && depositosHoy >= 3) {
            throw new RuntimeException("Se ha alcanzado el límite de depósitos para hoy"); //Excepcion NO chequeda
        }
    }

    private void validarLimiteExtraccionDiaria(double cantidad) throws Exception {
        if (ultimaFecha != null && ultimaFecha.equals(LocalDate.now()) && montoExtraidoHoy + cantidad > 1000) {
            throw new Exception("Se ha alcanzado el límite de extracción diario"); //Excepcion chequeda
        }
    }
}
