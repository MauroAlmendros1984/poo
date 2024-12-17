package com.example.poo.modulo05;

public class Pepita {
    private int energia = 100;

    public int getEnergia() {
        return energia;
    }

    public boolean esFuerte() {
        return energia > 50;
    }

    public void volar(int kms) {
        energia = energia - (kms + 10);
    }

    public void comer(int gramos) {
        energia = energia + 4 * gramos;
    }
}
