package com.example.poo.modulo14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Persona {
    public String nombre = "";
    public String domicilio = "";

    public boolean vivenJuntosCon(Persona otraPersona) {
        return domicilio.equals(otraPersona.getDomicilio());
    }
}


//En Wollok, el operador == se utiliza para verificar si dos objetos son iguales en cuanto a identidad
// (es decir, si son la misma instancia en la memoria), mientras que === se utiliza para verificar si
// dos objetos son iguales en cuanto a valor (es decir, si tienen los mismos atributos).
//En Java, el equivalente de == se utiliza para comparar referencias de objetos, es decir, si dos
// referencias apuntan a la misma instancia en memoria. Sin embargo, en Java no hay un equivalente
// directo de === para comparar objetos por valor.
//Para comparar objetos por valor en Java, generalmente se implementa el método equals() en la clase
// del objeto y se sobrescribe según el comportamiento deseado para la comparación. Por lo tanto,
// para lograr una funcionalidad similar a === en Java, se puede implementar el método equals()
// adecuadamente en la clase de objeto y luego usarlo para comparar los objetos.
