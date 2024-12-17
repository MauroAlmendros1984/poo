package com.example.poo.modulo04.heroesConObjetos;

import java.util.HashSet;
import java.util.Set;

public class Shrek {
    private final Set<Mision> misiones = new HashSet<>();

    public void agregarMision(Mision mision) {
        misiones.add(mision);
    }

    public int cantidadDeMisiones() {
        return misiones.size();
    }

    public Set<Mision> misionesDificiles() {
        Set<Mision> misionesDificiles = new HashSet<>();
        for (Mision mision : misiones) {
            if (mision.esDificil()) {
                misionesDificiles.add(mision);
            }
        }
        return misionesDificiles;
    }

    public Set<String> solicitantesDeMisMisiones() {
        Set<String> solicitantes = new HashSet<>();
        for (Mision mision : misiones) {
            solicitantes.add(mision.solicitante());
        }
        return solicitantes;
    }

    public int totalPuntosDeRecompensa() {
        int totalPuntos = 0;
        for (Mision mision : misiones) {
            totalPuntos += mision.puntosRecompensa();
        }
        return totalPuntos;
    }


}
