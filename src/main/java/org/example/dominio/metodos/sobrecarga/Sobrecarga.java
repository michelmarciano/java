package org.example.dominio.metodos.sobrecarga;

public class Sobrecarga {

    public int cadastrar(final Visitante visitante){
        return this.cadastrar(visitante, 1);
    }
    public int cadastrar(final Visitante visitante, final int tempoExpiracaoEmDias ){
        final int tempoExpiracaoEmMeses = tempoExpiracaoEmDias * 30;

        System.out.printf("O Visitante nome: " + visitante.nome);

        return tempoExpiracaoEmMeses;
    }

}
