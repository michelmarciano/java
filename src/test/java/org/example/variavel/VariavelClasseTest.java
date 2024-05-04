package org.example.variavel;

import org.example.metodos.metodoDeClasse.MetodoClasse;
import org.junit.jupiter.api.*;

@DisplayName("Variavel Instacia Test")
public class VariavelClasseTest {

    @BeforeAll
    static void init(){
        MetodoClasse produto = new MetodoClasse();
        produto.alterarCustoEmbalagem(10);
    }
    @Nested
    @DisplayName("Dado um Produto")
    class DadoUmProduto {

        @Nested
        @DisplayName("Quando alterar valor variavel de classe ")
        class Quando_alterar_valor_embalagem{

            @Test
            @DisplayName("Então retorne o valor alterado")
            public void Entao_retorne_valor_alterado() {

                MetodoClasse.custoEmbalagem = 20;

                Assertions.assertEquals(20, MetodoClasse.custoEmbalagem);
            }

        }

    }
}
