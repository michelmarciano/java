package org.example.dominio.memoria;

public class Memoria {

    public static void main(String[] args) {
        imprimeMemoria();
        byte[] x = new byte[500 * 1024 * 1025];
        imprimeMemoria();

    }

    static void imprimeMemoria(){
        System.out.println("-----------------------------------");
        limiteMemoriaJVMpodeUsar();
        limiteMemoriaReservadaPelaJVM();
        memoriaUsadaPelaJVM();
        quantidadeMemoriaDisponivelEmRelacaoAMemoriaReservadaPelaJVM();

    }

    static void limiteMemoriaJVMpodeUsar(){
        System.out.printf("Limite de Memória que a JVM pode usar: %s%n", byteToMegabite(Runtime.getRuntime().maxMemory()));
    }

    static void limiteMemoriaReservadaPelaJVM(){
        System.out.printf("Total memória reservada pela JVM: %s%n", byteToMegabite(Runtime.getRuntime().totalMemory()));
    }

    static void quantidadeMemoriaDisponivelEmRelacaoAMemoriaReservadaPelaJVM(){
        System.out.printf("Total Memória Disponivel em Relação a memória reservada pela JVM: %s%n", byteToMegabite(Runtime.getRuntime().freeMemory()));
    }

    static void memoriaUsadaPelaJVM(){
        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Memória Usada pela JVM: %s%n", byteToMegabite(memoriaUsada));
    }

    static String byteToMegabite(long bytes){
        return String.format("%.2fMB", ((bytes / 1024d) / 1024d));
    }


}
