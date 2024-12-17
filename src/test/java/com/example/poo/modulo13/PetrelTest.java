package com.example.poo.modulo13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrelTest {

    @Test
    void volar() {
        Petrel petrel = new Petrel();
        petrel.volar(5);
        assertEquals(35, petrel.getEnergia());
    }
}