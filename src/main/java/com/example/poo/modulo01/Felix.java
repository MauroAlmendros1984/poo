package com.example.poo.modulo01;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Felix {

    public String maullar () {
        String mensaje = "¡Miau!";
        log.info(mensaje);
        return mensaje;
    }

    public String comer () {
        String mensaje = "¡Voy a comer!";
        log.info(mensaje);
        return mensaje;
    }

    public String dormir () {
        String mensaje = "¡Voy a dormir!";
        log.info(mensaje);
        return mensaje;
    }

}
