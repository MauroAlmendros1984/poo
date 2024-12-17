package com.example.poo.modulo15;

class Vago implements TipoAlumno {
    @Override
    public boolean estudia(Alumno alumno, Parcial parcial) {
        return !alumno.aproboUltimoExamen();
    }
}
