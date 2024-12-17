package com.example.poo.modulo03;

public class Gato extends Animal {
    @Override
    public String hacerSonido() {
        System.out.println("El gato maulla");
        return "El gato maulla";
    }
}