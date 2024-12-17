package com.example.poo.modulo15;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Integer> notas = new ArrayList<>();
    private TipoAlumno tipoAlumno = new Estudioso();

    public void rendir(int nota) {
        notas.add(nota);
    }

    public boolean aproboUltimoExamen() {
        return notas.get(notas.size() - 1) >= 6;
    }

    public boolean estudiaPara(Parcial parcial) {
        return tipoAlumno.estudia(this, parcial);
    }

    public void setTipoAlumno(TipoAlumno tipoAlumno) {
        this.tipoAlumno = tipoAlumno;
    }

    public TipoAlumno getTipoAlumno() {
        return tipoAlumno;
    }
}
