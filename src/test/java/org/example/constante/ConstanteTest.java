package org.example.constante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Contante Test")
public class ConstanteTest {

    @Nested
    @DisplayName("Dado uma idade")
    class Dado_uma_idade_valida {

        @Nested
        @DisplayName("Quando validar ")
        class Quando_validar_se_idade_é_permitida{

            @Test
            @DisplayName("Entao deve retornar permitido")
            void Então_deve_retornar_verdadeiro(){
                //arrange
                Constante constante = new Constante();

                // action
                boolean permitido = constante.isPermitido(21);

                // assertion
                Assertions.assertTrue(permitido);
            }
        }
    }

}
