package org.example.metodos.metodoDeClasse;

import org.junit.jupiter.api.*;

@DisplayName("Produto Test")
public class MethodClasseTest {

    @BeforeAll
    static void init() {
        MetodoClasse produto = new MetodoClasse();
        produto.alterarCustoEmbalagem(10);
    }

    @Nested
    @DisplayName("Dado um Produto")
    class DadoUmProduto {

        @Nested
        @DisplayName("Quando alterar valor embalagem")
        class Quando_alterar_valor_embalagem {

            @Test
            @DisplayName("Então retorne o valor alterado")
            public void Entao_retorne_valor_alterado() {

                MetodoClasse.custoEmbalagem = 20;

                Assertions.assertEquals(20, MetodoClasse.custoEmbalagem);
            }

            @Test
            @DisplayName("Então valide se o valor alterado será aplicado apra a classe")
            public void Entao_valide_se_valor_alterado_sera_aplicado_para_a_classe() {

                Assertions.assertEquals(10, MetodoClasse.custoEmbalagem);
            }

        }

        @Nested
        @DisplayName("Quando enviar uma instancia de produto")
        class Quando_enviar_uma_instancia_de_produto {

            @Test
            @DisplayName("Então deve retornar valor total")
            public void Entao_deve_retornar_valor_total() {
                //cenario
                MetodoClasse produto = new MetodoClasse();
                produto.precoCusto = 200;
                // ação
                double valorTotal = MetodoClasse.calculaCustoTotal(produto);
                //assert
                Assertions.assertEquals(valorTotal, 210);

            }

        }

    }

}
