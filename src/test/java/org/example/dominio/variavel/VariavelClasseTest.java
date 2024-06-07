package org.example.dominio.variavel;

import org.example.dominio.metodos.metodoDeClasse.MetodoClasse;
import org.junit.jupiter.api.*;

@DisplayName("Variavel Instacia Test")
public class VariavelClasseTest {

    public static final int CUSTO_EMBALAGEM = 20;

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

                MetodoClasse metodoClasse = new MetodoClasse();

                MetodoClasse.custoEmbalagem = CUSTO_EMBALAGEM;

                Assertions.assertEquals(CUSTO_EMBALAGEM, MetodoClasse.custoEmbalagem);
                Assertions.assertEquals(CUSTO_EMBALAGEM, metodoClasse.retornaValorCustoEmbalagem());
            }

        }

    }
}
