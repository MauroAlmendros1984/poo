package com.example.poo.modulo01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FelixTest {

    @Test
    void testMaullar() {
        Felix felix = new Felix();
        String mensaje = felix.maullar();
        assertEquals("¡Miau!", mensaje);
    }

    @Test
    void testComer() {
        Felix felix = new Felix();
        String mensaje = felix.comer();
        assertEquals("¡Voy a comer!", mensaje);
    }

    @Test
    void testDormir() {
        Felix felix = new Felix();
        String mensaje = felix.dormir();
        assertEquals("¡Voy a dormir!", mensaje);
    }
}
