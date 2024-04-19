package org.example.estruturadedados.buscabinaria;

import java.util.Arrays;
import java.util.List;

public abstract class BuscaBinaria {

    public static void  buscabinaria(int alvo){
        int[] elementos = {1,2,3,4,5,6,7,8,9,11};
        int inicio = 0;
        int fim = elementos.length-1;
        int meio;

        while (inicio <= fim){
           meio = (inicio + fim) / 2;

            if(elementos[meio] == alvo){
               System.out.println(" encontrei o alvo " + alvo + " na posicao " + meio);
               return;
            }
            if (elementos[meio] > alvo){
                fim = meio -1;
            }
            else {
                inicio = meio +1;
            }
        }
        System.out.println("nao encontrei");
    }

    public static void main(String[] args) {
        BuscaBinaria.buscabinaria(7);
    }
}
