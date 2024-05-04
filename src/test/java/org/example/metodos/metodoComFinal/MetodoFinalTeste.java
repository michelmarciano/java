package org.example.metodos.metodoComFinal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Metodo com Final")
public class MetodoFinalTeste {


    @Test
    @DisplayName("Entao deve retornar salario hora")
    void Entao_deve_retornar_salario_hora(){
        //Arange
        MetodoFinal metodoFinal = new MetodoFinal();
        //Act
        double valorHora = metodoFinal.calculoValorHora(17200.00);
        //Assert
        Assertions.assertEquals(7.74, valorHora, 0.01);
    }
}
