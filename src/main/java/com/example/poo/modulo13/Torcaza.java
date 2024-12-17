package com.example.poo.modulo13;

public class Torcaza extends Ave {

    @Override
    public void comer(int gramos) {
        volar(1); // Vuela antes de comer
        super.comer(gramos); // Llama al método comer de la clase Ave
    }
}