package com.example.poo.modulo12;

import com.example.poo.modulo12.heroesConClases.BuscarItemMagico;
import com.example.poo.modulo12.heroesConClases.Heroe;
import com.example.poo.modulo12.heroesConClases.LiberarDoncella;
import com.example.poo.modulo12.heroesConClases.Mision;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeroeTest {

    private Heroe shrek;
    private LiberarDoncella liberarAFiona;
    private BuscarItemMagico buscarItemMagico;

    @BeforeEach
    void setUp() {
        shrek = new Heroe();
        liberarAFiona = new LiberarDoncella(5);
        buscarItemMagico = new BuscarItemMagico(40);
        shrek.agregarMision(liberarAFiona);
        shrek.agregarMision(buscarItemMagico);
    }

    @Test
    void testMisionConMayorRecompensa() {
        Mision mision = shrek.misionQueTengaMayorRecompensaQue(5);
        assertNotNull(mision, "Debería existir una misión con recompensa mayor a 5 puntos.");
        assertEquals(10, mision.puntosRecompensa(), "La recompensa de la misión debería ser 10 puntos.");
    }

    @Test
    void testOrdenDeMisionesPorPuntos() {
        Set<Mision> misionesOrdenadas = shrek.misionesOrdenadasPorPuntos();
        assertEquals(2, misionesOrdenadas.size(), "Deberían existir 2 misiones en total.");

        Mision[] misionesArray = misionesOrdenadas.toArray(new Mision[0]);
        assertEquals(10, misionesArray[0].puntosRecompensa(), "La primera misión debería tener 5 puntos de recompensa.");
        assertEquals(5, misionesArray[1].puntosRecompensa(), "La segunda misión debería tener 10 puntos de recompensa.");
    }

    @Test
    void testCambioDeSolicitante() {
        shrek.cambiarSolicitante("señor X");
        shrek.getMisiones().forEach(mision -> assertEquals("señor X", mision.getSolicitante(), "El solicitante de todas las misiones debería ser 'señor X'."));
    }
}
