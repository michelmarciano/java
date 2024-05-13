package org.example.classe;

import org.example.classes.Carro;
import org.example.classes.Pessoa;
import org.junit.jupiter.api.*;

@DisplayName("Teste Classe")
public class CarroTest {

    Pessoa pessoa;
    Carro carro;

    @BeforeEach
    void setup() {
        pessoa = new Pessoa();
        carro = new Carro();
    }

    @Nested
    @DisplayName("Dado um obejto Carro")
    class Dado_um_Objeto_Carro {

        @Nested
        @DisplayName("Quando imprimir ")
        class Quando_imprimir {

            @Test
            @DisplayName("Entao deve retornar todos os atributos de um carro")
            void Entao_deve_retornar_os_atributos_de_um_carro() {
                //Arange
                pessoa.nome = "Mike";
                pessoa.cpf = "32201635803";

                carro.anoFabricacao = 2023;
                carro.cor = "Branco";
                carro.modelo = "Volvo";
                carro.proprietario = pessoa;
                carro.valor = 300000.00;

                //Action
                double valorIpva = carro.calculaIpva();

                //Assertion
                Assertions.assertEquals(12000.0, valorIpva);

            }
        }
    }
}
