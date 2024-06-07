package org.example.dominio.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Teste CharAt com Paramentros")
public class CharAtTest {


    @Nested
    @DisplayName("Dado um indice")
    class DadoUmIndice {

        @Nested
        @DisplayName("Quando Processar")
        class QuandoProcessar {

            @ParameterizedTest
            @ValueSource(ints = {0, 1, 2, 3, 4})
            @DisplayName("Entao retorna caractere")
            void deveRetornarCaractere(int index) {
                CharAt charAt = new CharAt();

                char[] listChar = {'M', 'I', 'K', 'E', 'M'};

                char c = charAt.dadoUmaStringEUmIndiceDeveDevolverUmCaractere("MIKEMARCIANO", index);
                Assertions.assertEquals(listChar[index], c);

            }


        }
    }


}
