package org.example.testesunitarios.algaworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CenariosTest {

    @Test
    public void saudar(){
        String expected = "Bom dia";
        String saudacao = Cenarios.saudar(9);
        assertEquals(expected, saudacao, "Saudacao incorreta" );

    }

    @Test
    public void deveLancarUmaException(){
        String expected = "Hora invalida";
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> Cenarios.saudar(-10));

        assertEquals(expected, illegalArgumentException.getMessage());
    }

    @Test
    public void naoDeveLancarException(){
        assertDoesNotThrow(()-> Cenarios.saudar(9));
    }

    @Test
    public void deveDevolverNumerosPares(){
        List<Integer> expected = Arrays.asList(2,4,6,8,10);

        //cenario
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //validacao
        List<Integer> listaAtual = Cenarios.inteiros(list);

        assertIterableEquals(expected, listaAtual);
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> Cenarios.inteiros(list));
    }
}
