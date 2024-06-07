package org.example.dominio.lambda.coder3.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Michel", "Jacqueline", "Sophia", "Luisa");

        /**
         * fazendo foreach com for melhorado
         */
        for (String nome: lista){
            System.out.println("FOR MELHORADO - NOME ->>>>" + nome);
        }

        /**
         * Fazendo foreach com lambda, dentro da funacao lambda eu recebo o nome
         * como parametro e para cara iteracao eu vou imprimir o nome
         */
        lista.forEach((nome) -> System.out.println("FOR LAMBDA NOME ->>>>" + nome));

                /**
         * Fazendo foreach com lambda, dentro da funacao lambda eu recebo o nome
         * como parametro e para cara iteracao eu vou imprimir o nome
         */
        lista.forEach( nome -> System.out.println("FOR LAMBDA NOME ->>>>" + nome));

        /**
         * Method Reference
         */
        lista.forEach( System.out::println);
    }
}
