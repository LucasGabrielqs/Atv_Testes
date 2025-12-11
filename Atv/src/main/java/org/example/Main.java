package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista_valido = Arrays.asList("abcde","abcdef","a1234");
        List<String> lista_invalido = Arrays.asList("1234567","abcdefg","123456");

        Identifier id = new Identifier();

        System.out.println("Começa os testes das Strings válidas:");
        for(String s: lista_valido) {
            System.out.println(id.validateIdentifier(s) ? "Válido" : "Inválido");
        }


        System.out.println("Começa os testes das Strings inválidas:");
        for (String s: lista_invalido) {
            System.out.println(id.validateIdentifier(s) ? "Válido" : "Inválido");
        }
    }
}
