package org.example.estruturadedados.pilha;

import java.util.Arrays;

public class Pilha<T> {
    private T[] elementos;
    private int ponteiro;

    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        ponteiro = 0;
    }

    public Pilha() {
        this(1);
    }

    public void imprimePilha() {
        for (int i = 0; i <=ponteiro; i++) {
            System.out.println(elementos[i]);
        }
    }

    private T[] aumentaCapacidade(){
        T[] novoElemento = (T[]) new Object[(elementos.length * 2)];

        for (int i=0; i < elementos.length; i++){
            novoElemento[i] = elementos[i];
        }
        return this.elementos = novoElemento;
    }

    public void adiciona(T valor) {
        if (ponteiro < elementos.length) {
            elementos[ponteiro] = valor;
            ponteiro++;
        }
        else {
            aumentaCapacidade();
            elementos[ponteiro] = valor;
        }
    }

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        pilha.adiciona(10);
        pilha.adiciona(5);
        pilha.imprimePilha();

    }

}
