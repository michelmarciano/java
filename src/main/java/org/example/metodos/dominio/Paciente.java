package org.example.metodos.dominio;

public class Paciente {
    public String nome;
    public String sobrenome;
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
