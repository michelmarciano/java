package org.example.dominio.composicao.negocio;

public class Funcionario {
    public String nome;
    public Integer quantidadeFilhos;

    boolean possuiFilhos() {
        return quantidadeFilhos > 0;
    }
}
