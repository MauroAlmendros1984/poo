package com.example.poo.modulo13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AveTest {

    @Test
    void volar() {
        Ave ave = new Golondrina();
        ave.volar(50);
        assertEquals(40, ave.getEnergia());
    }

    @Test
    void comer() {
        Ave ave = new Golondrina();
        ave.comer(10);
        assertEquals(100, ave.getEnergia());
    }
}
