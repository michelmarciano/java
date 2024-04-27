package org.example.classes;

import org.example.classes.dominio.Carro;
import org.example.classes.dominio.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa proprietario1 = new Pessoa();
        Pessoa proprietario2 = new Pessoa();

        Carro carro1 = new Carro();
        carro1.anoFabricacao = 2022;
        carro1.cor = "Branco";
        carro1.setProprietario(proprietario1);

        Carro carro2 = new Carro();
        carro2.setProprietario(proprietario2);

        carro1.imprimeResumoCarro();

    }
}
