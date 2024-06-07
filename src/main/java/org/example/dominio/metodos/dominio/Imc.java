package org.example.dominio.metodos.dominio;

public class Imc {
    public double resultado;
    public double peso;
    public double altura;

    public Imc calculaImc() {
        Imc imc = new Imc();
        imc.resultado = (peso / (altura * altura));
        imc.altura = altura;
        imc.peso = peso;

        return imc;

    }
}
