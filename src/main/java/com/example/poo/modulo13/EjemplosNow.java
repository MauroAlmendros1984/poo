package com.example.poo.modulo13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;


public class EjemplosNow {
    public static void main(String[] args) {
        // Obtener la fecha y hora actual en la zona horaria por defecto del sistema
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Fecha y hora actual en la zona horaria por defecto: " + localDateTime);

        // Obtener todas las zonas horarias disponibles
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("Zonas horarias disponibles: " + zoneIds);

        // Obtener la fecha y hora actual en una zona horaria específica
        String zonaHoraria = "America/New_York";
        ZoneId zoneId = ZoneId.of(zonaHoraria);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("Fecha y hora actual en " + zonaHoraria + ": " + zonedDateTime);
    }
}

// El método now() se utiliza para obtener la fecha y hora actual en el sistema.
// Podemos usarlo para obtener la fecha y hora actual en diferentes zonas horarias utilizando
// la clase ZoneId de Java.

//En este ejemplo:
//
//Utilizamos LocalDateTime.now() para obtener la fecha y hora actuales en la zona horaria por
// defecto del sistema.
//
//Utilizamos ZoneId.getAvailableZoneIds() para obtener todas las zonas horarias disponibles.
//
//Seleccionamos una zona horaria específica (en este caso, "America/New_York") y la usamos para obtener
// la fecha y hora actuales en esa zona utilizando ZonedDateTime.now(ZoneId.of(zonaHoraria)).
