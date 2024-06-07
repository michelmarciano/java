package org.example.dominio.metodos.metodoDeClasse;

public class MetodoClasse {
    public static double custoEmbalagem;
    public double precoCusto;
    public double precoVenda;

    /**
     * Não usamos o this porque o static é uma variavel de classe
     * @param custoEmbalagem
     */
    public void alterarCustoEmbalagem(double custoEmbalagem){

        MetodoClasse.custoEmbalagem = custoEmbalagem;
    }

    /**
     * Eu consigo usar uma variavel de classe passando a referencia como argumento de metodo
     * @param produto
     * @return
     */
    public static double calculaCustoTotal(MetodoClasse produto){
        return produto.precoCusto + MetodoClasse.custoEmbalagem;
    }

    public double retornaValorCustoEmbalagem(){
        return MetodoClasse.custoEmbalagem;
    }


}
