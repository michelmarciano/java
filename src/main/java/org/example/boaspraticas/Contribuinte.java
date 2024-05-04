package org.example.boaspraticas;

public class Contribuinte {
    public static final int IDADE_MINIMA_APOSENTADORIA = 65;
    int idade;
    int tempoContribuicaoEmAnos;

    boolean estaElegivelParaAposentadoria(){
        return idade >= IDADE_MINIMA_APOSENTADORIA;
    }
}
