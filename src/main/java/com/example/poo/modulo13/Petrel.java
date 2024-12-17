package com.example.poo.modulo13;

public class Petrel extends Ave {
    private int kilometrosVolados = 0;

    @Override
    public void volar(int kilometros) {
        kilometrosVolados += kilometros;
        super.volar(kilometros);
    }
}
