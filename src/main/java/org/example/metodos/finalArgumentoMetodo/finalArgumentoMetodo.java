package org.example.metodos.finalArgumentoMetodo;

public class finalArgumentoMetodo {

    public static void imprimirNumero(final int numero) {
        // numero = 20;
        // Isso causaria um erro de compilação pois temos final na declaracao do metodo
        System.out.println("O número é: " + numero);
    }


}
