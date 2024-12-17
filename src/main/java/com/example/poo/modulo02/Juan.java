package com.example.poo.modulo02;

public class Juan {
    private Mascota mascota;

    public void asignarMascota(Mascota nuevaMascota) {
        mascota = nuevaMascota;
        mascota.establecerDuenio(this);
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void alimentarA(Mascota mascota) {
        // Implementa la lógica para alimentar a la mascota
    }
}
