package com.example.poo.modulo04;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> maxFunction = (num1, num2) -> Math.max(num1, num2);
        BiFunction<Integer, Integer, Integer> sumFunction = Integer::sum;

        System.out.println(applyFunction(maxFunction, 4, 2)); // Salida: 4
        System.out.println(applyFunction(sumFunction, 4, 2)); // Salida: 6
    }

    private static int applyFunction(BiFunction<Integer, Integer, Integer> function, int num1, int num2) {
        return function.apply(num1, num2);
    }


}
