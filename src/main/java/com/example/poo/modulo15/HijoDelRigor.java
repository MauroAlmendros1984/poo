package com.example.poo.modulo15;

class HijoDelRigor implements TipoAlumno {
    @Override
    public boolean estudia(Alumno alumno, Parcial parcial) {
        return parcial.esDificil();
    }
}
