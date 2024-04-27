package org.example.metodos.dominio;

import org.example.metodos.dominio.Imc;
import org.example.metodos.dominio.Paciente;
import org.example.metodos.tipoPrimitivo.MetodoTipoPrimitivo;

public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.nome = "Michel";
        paciente.peso = 87.2;
        paciente.altura = 1.67;

        Imc imc = paciente.calculaImc();

        System.out.printf("Calculo IMC =%f ", imc.resultado);

    }
}
