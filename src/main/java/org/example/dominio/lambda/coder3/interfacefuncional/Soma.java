package org.example.dominio.lambda.coder3.interfacefuncional;

public class Soma implements Calculo{


    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
