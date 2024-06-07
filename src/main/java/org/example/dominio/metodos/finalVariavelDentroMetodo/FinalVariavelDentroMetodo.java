package org.example.dominio.metodos.finalVariavelDentroMetodo;

public class FinalVariavelDentroMetodo {

    /**
     * Metodo com final impede que a variavel seja reaproveitada para
     * calculos dentro do metodo
     * @param salario
     * @return
     */
    public double calculoValorHora(final double salario){
       final double valorHora = salario / 2220;

        return valorHora;
    }
}
