package org.example.dominio.metodos.finalDeclaracaoMetodo;

public class FinalDeclaracaoMetodo {

    class Animal {
        public final void respirar() {
            System.out.println("Respirando...");
        }
    }

    class Gato extends Animal {
        // Erro de compilação: respirar() em Animal não pode ser sobrescrito
        // public void respirar() {
        //     System.out.println("Miando enquanto respira...");
        // }
    }
}
