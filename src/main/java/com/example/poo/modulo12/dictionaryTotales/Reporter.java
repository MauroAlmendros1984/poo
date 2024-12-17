package com.example.poo.modulo12.dictionaryTotales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reporter {
    private final List<Rendicion> rendiciones = new ArrayList<>();

    // Constructor vacío si se desea mantener el patrón de añadir rendiciones manualmente
    public Reporter() {
    }

    // Método para añadir rendiciones
    public void agregarRendicion(Rendicion rendicion) {
        rendiciones.add(rendicion);
    }

    // Calcula el total por cliente
    public Map<String, Integer> totalPorCliente() {
        Map<String, Integer> totales = new HashMap<>();
        for (Rendicion rendicion : rendiciones) {
            totales.merge(rendicion.getPersona(), rendicion.getTotal(), Integer::sum);
        }
        return totales;
    }

    // Muestra el total acumulado por cada cliente
    public void mostrarTotalesPorCliente() {
        totalPorCliente().forEach((persona, total) ->
                System.out.println(persona + " - $ " + total));
    }

    // Calcula el total por fecha
    public Map<LocalDate, Integer> totalPorFecha() {
        Map<LocalDate, Integer> totales = new HashMap<>();
        for (Rendicion rendicion : rendiciones) {
            totales.merge(rendicion.getFecha(), rendicion.getTotal(), Integer::sum);
        }
        return totales;
    }

    // Muestra el total acumulado por fecha
    public void mostrarTotalesPorFecha() {
        totalPorFecha().forEach((fecha, total) ->
                System.out.println(fecha.toString() + " - $ " + total));
    }
}
