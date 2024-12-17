package com.example.poo.modulo04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaEjemplo {
    public static void main(String[] args) {
        // Creamos una lista de números enteros desordenados
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        // Usamos una expresión lambda para ordenar la lista en orden ascendente
        numeros.sort(Comparator.comparingInt(num -> num));

        // Imprimimos la lista ordenada
        System.out.println("Lista ordenada:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}

//    En este ejemplo, la expresión lambda (Comparator.comparingInt(num -> num)) se utiliza
//    como un argumento para el método sort() de la lista numeros. Esta expresión
//    lambda representa una función que toma dos parámetros num1 y num2
//    (los números que queremos comparar) y devuelve la diferencia entre num1 y num2.
//    Esto indica al método sort() cómo debe ordenar los elementos de la lista.
//    La lista se ordenará en orden ascendente según el valor de los elementos.
