package metodos.instanciaAlterandoVariavelEstatica;

import org.example.metodos.instanciaAlterandovariavelEstatica.Produto;
import org.junit.jupiter.api.*;

@DisplayName("Produto Test")
public class ProdutoTest {

    @BeforeAll
    static void init(){
        Produto produto = new Produto();
        produto.alterarCustoEmbalagem(10);
    }
    @Nested
    @DisplayName("Dado um Produto")
    class DadoUmProduto {

        @Nested
        @DisplayName("Quando alterar valor embalagem")
        class Quando_alterar_valor_embalagem{

            @Test
            @DisplayName("Então retorne o valor alterado")
            public void Entao_retorne_valor_alterado() {

                Produto.custoEmbalagem = 20;

                Assertions.assertEquals(20, Produto.custoEmbalagem);
            }

            @Test
            @DisplayName("Então valide se o valor alterado será aplicado apra a classe")
            public void Entao_valide_se_valor_alterado_sera_aplicado_para_a_classe() {

                Assertions.assertEquals(10, Produto.custoEmbalagem);
            }


        }

    }

}
