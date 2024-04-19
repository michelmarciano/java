package org.example.classes.teste;

import org.example.classes.Carro;
import org.example.classes.Proprietario;

public class Principal {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Proprietario proprietario = new Proprietario();

        carro.proprietario = proprietario;
    }
}
