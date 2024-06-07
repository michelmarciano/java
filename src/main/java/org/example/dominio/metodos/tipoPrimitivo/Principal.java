package org.example.dominio.metodos.tipoPrimitivo;

public class Principal {

    public static void main(String[] args) {
        double precoCusto = 10;
        new MetodoTipoPrimitivo().calculaPrecoVendo(precoCusto);
        System.out.printf("Valor calcuclo de preco: %f", precoCusto);
    }

}
