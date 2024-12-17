package com.example.poo.modulo09;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Ave {
    public Integer energia = 100;

    public void volar(Integer kms) {
        energia = energia - (kms * 5);
        log.info("Queda {} de energia",energia);

    }
}
