package com.example.poo.modulo11;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j

public class Pepita {
    public int energia;
    public List<Ciudad> ciudadesFavoritas;

    public Pepita(int energiaInicial) {
        this.energia = energiaInicial;
        this.ciudadesFavoritas = new ArrayList<>();
    }
    public int getEnergia() {
        return energia;
    }

    public boolean esFuerte() {
        return energia > 50;
    }

    public int volar(Ciudad ciudad) {
        energia = energia - ( ciudad.consumo() + 10 );
        log.info("Luego de volar queda energia por: {}", energia);
        return energia;
    }

    public int comer(int gramos) {
        energia = energia + 4 * gramos;
        log.info("Luego de comer queda energia por: {}", energia);
        return energia;
    }

    public void cumplirDeseo() {
        Ciudad destino = ciudadesFavoritas.get(ciudadesFavoritas.size() - 1);
        volar(destino);
        ciudadesFavoritas.remove(destino);
    }
    public void agregarCiudad(Ciudad ciudad) {
        ciudadesFavoritas.add(ciudad);
    }

    public boolean esFavorita(Ciudad ciudad) {
        return ciudadesFavoritas.contains(ciudad);
    }
}
