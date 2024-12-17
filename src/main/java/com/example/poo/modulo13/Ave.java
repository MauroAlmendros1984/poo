package com.example.poo.modulo13;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Ave {
    private int energia = 50;

    public void volar(int kilometros) {
        energia -= (kilometros + 10);
    }

    public void comer(int gramos) {
        energia += gramos * 4;
    }

    public int getEnergia() {
        return energia;
    }
}
