package org.example.dominio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Michel", "Jac", "Sophia", "Luisa");

        /**
         * Imprima na saida do systema cada nome "parte da stream"
         */
        aprovados.stream().forEach(System.out::println);
    }
}
