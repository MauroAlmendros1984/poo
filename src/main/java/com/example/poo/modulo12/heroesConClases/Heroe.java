package com.example.poo.modulo12.heroesConClases;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class Heroe {
    private Set<Mision> misiones = new HashSet<>();

    public void agregarMision(Mision mision) {
        misiones.add(mision);
    }

    public int cantidadDeMisiones() {
        return misiones.size();
    }

    public Set<Mision> misionesDificiles() {
        return misiones.stream().filter(Mision::esDificil).collect(Collectors.toSet());
    }

    public Set<String> solicitantesDeMisMisiones() {
        return misiones.stream().map(Mision::getSolicitante).collect(Collectors.toSet());
    }

    public int totalPuntosDeRecompensa() {
        return misiones.stream().mapToInt(Mision::puntosRecompensa).sum();
    }

    public Mision misionQueTengaMayorRecompensaQue(int puntos) {
        return misiones.stream().filter(m -> m.puntosRecompensa() > puntos).findFirst().orElse(null);
    }

    public Set<Mision> misionesOrdenadasPorPuntos() {
        return misiones.stream().sorted((m1, m2) -> Integer.compare(m1.puntosRecompensa(), m2.puntosRecompensa())).collect(Collectors.toCollection(HashSet::new));
    }

    public void cambiarSolicitante(String nuevoSolicitante) {
        misiones.forEach(m -> m.setSolicitante(nuevoSolicitante));
    }
}
