package org.example.dominio.lambda.coder3.interfacefuncional;

@FunctionalInterface
public interface Calculo {

      double executar(double a, double b);

      default String legal() {
            return "Bom dia";
      }
}
