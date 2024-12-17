package com.example.poo.modulo02;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Pepita {
    int energia = 100;

    public int volar() {
      energia = energia - 10;
      log.info("Luego de volar queda energia por: {}", energia);
        return energia;
    }

    public int comer(int cantidad) {
        energia = energia * 2 + cantidad;
        log.info("Luego de comer queda energia por: {}", energia);
        return energia;
    }

    public int getEnergia () {
        log.info("La energia actual es de: {}", energia);
        return energia;
    }

    public int setEnergia(int _energia) {
        energia = _energia;
        return _energia;
    }
}
