package org.example.dominio.instancia;

import org.example.dominio.metodos.metodoDeClasse.MetodoClasse;

public class VariavelClasse {

    public static double custoEmbalagem;
    public double precoCusto;
    public double precoVenda;

    /**
     * Não usamos o this porque o static é uma variavel de classe
     *
     * @param custoEmbalagem
     */
    public void alterarCustoEmbalagem(double custoEmbalagem) {
        MetodoClasse.custoEmbalagem = custoEmbalagem;
    }

    public void imprimirCustoEmbalagem() {
        System.out.println("Cus");
    }

}
