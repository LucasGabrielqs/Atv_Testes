package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {

        List<String> lista_valido = Arrays.asList("abcde","abcdef","a1234");
        List<String> lista_invalido = Arrays.asList("a1cde","1234567","abcdefg","123456");

        Identifier id = new Identifier();

        System.out.println("Começa os testes das Strings válidas:");
        for(String s: lista_valido) {
            if(id.validateIdentifier(s)){
                System.out.println("Valido");
            } else {
                System.out.println("Invalido");
            }
        }

        System.out.println("Começa os testes das Strings inválidas:");
        for (String s: lista_invalido) {
            if(id.validateIdentifier(s)){
                System.out.println("Valido");
            } else {
                System.out.println("Invalido");
            }
        }

        }
}

