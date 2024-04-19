package org.example.lambda.coder3.interfacefuncional;

public class Multiplicar implements Calculo{

    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
