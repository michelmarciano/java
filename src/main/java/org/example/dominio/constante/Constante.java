package org.example.dominio.constante;

public class Constante {

    static final int IDADE_MINIMA = 18;

    public boolean isPermitido(int idade){
        return idade >= IDADE_MINIMA;
    }
}
