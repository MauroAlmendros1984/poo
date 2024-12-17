package com.example.poo.modulo08;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método idempotente
    public void establecerSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    // Método no idempotente
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public double obtenerSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        // Ejecución idempotente
        cuenta.establecerSaldo(5000.0);
        System.out.println("Saldo tras la primera asignación: " + cuenta.obtenerSaldo());

        cuenta.establecerSaldo(5000.0);
        System.out.println("Saldo tras la segunda asignación: " + cuenta.obtenerSaldo());

        // Ejecución no idempotente
        cuenta.depositar(500.0);
        System.out.println("Saldo tras el primer depósito: " + cuenta.obtenerSaldo());

        cuenta.depositar(500.0);
        System.out.println("Saldo tras el segundo depósito: " + cuenta.obtenerSaldo());
    }
}

//La idempotencia es una propiedad de ciertas operaciones que permite que sean ejecutadas varias veces
// sin cambiar el resultado más allá de la primera ejecución. Esto es especialmente importante en el
// desarrollo de APIs y servicios web, donde una solicitud puede ser reintentada debido a errores de red
// o fallos en la comunicación, sin que ello afecte el estado final del sistema.
//
//Un ejemplo de idempotencia podría ser una operación de asignación o la actualización de
// un registro en una base de datos donde el valor asignado es siempre el mismo.

//En este ejemplo, el método establecerSaldo es idempotente porque se puede llamar con el mismo valor
// muchas veces, pero el saldo final será siempre el mismo que si se hubiera llamado una sola vez.
// Por otro lado, el método depositar no es idempotente, ya que cada vez que se lo llama, el estado
// (el saldo en este caso) cambia.
//
//Este concepto es crucial en el diseño de APIs REST, donde los métodos GET, PUT, DELETE son idempotentes
// por definición, lo que significa que no importa cuántas veces se realice una solicitud con estos
// métodos, el resultado final será el mismo que si se hubiera hecho una sola vez (asumiendo que no hay
// cambios entre las solicitudes). El método POST, por otro lado, se considera no idempotente porque
// crea un nuevo recurso cada vez que se llama.
