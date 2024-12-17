package com.example.poo.modulo04;

public class HelloWorld {
    private String to;

    public HelloWorld(String to) {
        this.to = to;
    }

    public String apply() {
        return "hello " + to;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld("world");
        System.out.println(helloWorld.apply()); // Salida: hello world

        // Actualizando el valor de "to"
        helloWorld.setTo("someone else");
        System.out.println(helloWorld.apply()); // Salida: hello someone else
    }

    public void setTo(String to) {
        this.to = to;
    }
}
