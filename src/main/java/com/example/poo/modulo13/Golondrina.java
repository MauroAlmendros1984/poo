package com.example.poo.modulo13;

public class Golondrina extends Ave {
    private int energia = 100;

    public int getEnergia() {
        return energia;
    }

    public void volar(int metros) {
        energia -= metros + 10;
    }

    public void comer(Comida comida) {
        energia += comida.getEnergia();
    }
}