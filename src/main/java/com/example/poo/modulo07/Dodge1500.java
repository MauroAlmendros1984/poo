package com.example.poo.modulo07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dodge1500 {
    private String color = "bordo";
    private Integer kilometraje = 150000;
    private boolean conAire = false;
    private final String patente = "RVM 363";
    private final Integer anioPatentamiento = 1979;

    public void realizarViaje(Integer kilometros) {
        kilometraje = kilometraje + kilometros;
    }

}
