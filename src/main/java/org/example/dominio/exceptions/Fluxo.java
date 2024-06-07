package org.example.dominio.exceptions;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("ini do main");
        metodo1();
        Fluxo f = null;
        f.deposita();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("ini do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    public static void metodo2() {
        try {
            System.out.println("ini do metodo2");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                int a = i / 0;
            }
            System.out.println("fim do metodo2");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void deposita(){
        System.out.println("valor depositado");
    }
}
