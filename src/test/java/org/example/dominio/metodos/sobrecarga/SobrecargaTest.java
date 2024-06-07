package org.example.dominio.metodos.sobrecarga;

import org.example.dominio.metodos.sobrecarga.Sobrecarga;
import org.example.dominio.metodos.sobrecarga.Visitante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SobrecargaTest {

    @Nested
    @DisplayName("Quando enviar somente um parametro")
    class Quando_enviar_somente_um_parametro {

        @Test
        @DisplayName("Entao deve retornar total em dias")
        void Entao_deve_retornar_total_em_dias() {
            //arange
            Visitante visitante = new Visitante();
            visitante.nome = "mike";
            Sobrecarga sobrecarga = new Sobrecarga();

            //action
            int cadastrar = sobrecarga.cadastrar(visitante);

            //assert
            Assertions.assertEquals(30, cadastrar);
        }
    }

    @Nested
    @DisplayName("Quando enviar dois parametros")
    class Quando_enviar_dois_parametro {

        @Test
        @DisplayName("Entao deve retornar total em dias")
        void Entao_deve_retornar_total_em_dias() {
            //arange
            Visitante visitante = new Visitante();
            visitante.nome = "mike";
            Sobrecarga sobrecarga = new Sobrecarga();

            //action
            int cadastrar = sobrecarga.cadastrar(visitante, 10);

            //assert
            Assertions.assertEquals(300, cadastrar);
        }
    }
}
