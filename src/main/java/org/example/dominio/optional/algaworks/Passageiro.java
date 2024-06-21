package org.example.dominio.optional.algaworks;

import java.util.Objects;

public class Passageiro {

    private String nome;

    public Passageiro(String nome){
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
