package org.example.dominio.variavel;

import org.example.dominio.variavel.dominio.Visitante;

public class ModificadorFinal {

    /**
     * Usamos o modificar final dentro de um metodo para essa varivavel seja imutavel
     * @param visitante
     * @param tempoExpiracao
     */
    void cadastrar (Visitante visitante, int tempoExpiracao){
        final int tempoExpiracaoEmDias = tempoExpiracao * 30;

        System.out.printf("Visitante %s cadastrado para %d dias %n,", visitante.nome, tempoExpiracaoEmDias);
    }
    void cadastrarComFinal (Visitante visitante, final int tempoExpiracao){
        final int tempoExpiracaoEmDias = tempoExpiracao * 30;

        System.out.printf("Visitante %s cadastrado para %d dias %n,", visitante.nome, tempoExpiracaoEmDias);
    }
}
