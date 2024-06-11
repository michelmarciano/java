package org.example.dominio.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes ValueOf")
public class ValueOfTest {

    @Test
    @DisplayName("Então converte em uma String")
    void converteInteiroEmString() {
        int valor = 10;
        String experado = String.valueOf(10);

        ValueOf valueOf = new ValueOf();
        String atual = valueOf.dadoUmValorOMesmoSeraConvertidoEmUmString(valor);

        Assertions.assertEquals(experado, atual);

    }
}
