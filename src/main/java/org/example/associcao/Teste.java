package org.example.associcao;

import org.example.associcao.dominio.Jogador;
import org.example.associcao.dominio.Time;

public class Teste {

    /*
     * O momento exato que temos a associação do jogador
     * em um time é quando usamos o jogador.setTime(time)
     */
    public static void main(String[] args) {
        Time time = new Time("Brazil");
        Jogador jogador = new Jogador("Mike", time);
    
        jogador.imprime();
    }

}
