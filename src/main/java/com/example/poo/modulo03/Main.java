package com.example.poo.modulo03;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases Ipod, DvdPlayer y VhsRecorder
        Ipod ipod = new Ipod();
        DvdPlayer dvdLiving = new DvdPlayer();
        VhsRecorder vhsRecorder = new VhsRecorder();

        // Llamar al método play() en cada objeto
        ipod.play();
        dvdLiving.play();
        vhsRecorder.play();

        Baigorria baigorria = new Baigorria();
        Gimenez gimenez = new Gimenez();
        Empleado empleado = new Empleado("Galvan",1000);

        empleado.sueldo();
        empleado.getNombre();
        gimenez.pagarA(empleado);
        baigorria.sueldo();
    }
}
