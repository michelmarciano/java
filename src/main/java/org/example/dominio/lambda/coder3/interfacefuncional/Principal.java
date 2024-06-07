package org.example.dominio.lambda.coder3.interfacefuncional;

public class Principal {

    public static void main(String[] args) {
     //   Calculo soma = new Soma();
    //    Calculo multiplicar = new Multiplicar();

        Calculo somaLambda = (x, y) ->  x + y;

        System.out.println(somaLambda.legal());

    }
}
