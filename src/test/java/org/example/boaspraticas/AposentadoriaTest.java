package org.example.boaspraticas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AposentadoriaTest {

    @DisplayName("Dado uma uma idade acima de 65 anos")
    @Nested
    class Dado_uma_idade {

        @DisplayName("Quando calcular tempo de aposentadoria")
        @Nested
        class Quando_calcular_tempo_de_aposentadoria{

            @DisplayName("Entao deve retornar true")
            @Test
            void Entao_deve_retornar_true(){
                //arange
                Contribuinte contribuinte = new Contribuinte();
                contribuinte.idade = 70;
                contribuinte.tempoContribuicaoEmAnos = 20;

                //action
                boolean estaElegivel = contribuinte.estaElegivelParaAposentadoria();

                //assert
                Assertions.assertTrue(estaElegivel);
            }

        }

    }

}
