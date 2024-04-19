package org.example.testesunitarios.algaworks;

import java.util.List;

public class Cenarios {

    public static String saudar(int hora){
        if(hora >= 0 && hora <= 11){
            return "Bom dia";
        } else if (hora >= 12 && hora <= 17) {
            return "Boa tarde";
        } else if (hora >=18 && hora <=23) {
            return "Boa Noite";
        }
        throw new IllegalArgumentException("Hora invalida");
    }

    public static List<Integer> inteiros(List<Integer> lista){
       return lista.stream().filter(e -> e % 2 ==0).toList();
    }
}
