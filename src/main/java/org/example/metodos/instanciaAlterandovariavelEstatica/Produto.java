package org.example.metodos.instanciaAlterandovariavelEstatica;

public class Produto {
    public static double custoEmbalagem;
    public double precoCusto;
    public double precoVenda;

    /**
     * Não usamos o this porque o static é uma variavel de classe
     * @param custoEmbalagem
     */
    public void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;
    }

    public void imprimirCustoEmbalagem(){
        System.out.println("Cus");
    }


}
