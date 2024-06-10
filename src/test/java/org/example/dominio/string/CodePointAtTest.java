package org.example.dominio.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Teste codePointAt com parametros")
public class CodePointAtTest {

    @Nested
    @DisplayName("Dado uma String e um indice")
    class dadoUmaStringEUmIndice{

        @Nested
        @DisplayName("Quando Processar")
        class quandoProcesssar{

            @ParameterizedTest
            @ValueSource(ints = {0,1,2,3})
            @DisplayName("Entao deve devolver um unicode")
            void entaoDevolveUmUnicode(int index){

                int[] expected = {77,73,75,69};
                CodePointAt codePointAt = new CodePointAt();

                int atual = codePointAt.devolveUnicode("MIKE", index);
                Assertions.assertEquals(expected[index], atual);

            }
        }
    }
}
