package org.example.dominio.boaspraticas;

public class AposentadoriaTempoContribuicao {

    void solicitarAposentadoria(Contribuinte contribuinte){
        if (contribuinte.estaElegivelParaAposentadoria()){
            System.out.println("Esta elegivel");
        }else{
            System.out.println("Não esta elegivel");
        }
    }

}
