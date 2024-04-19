package org.example.associcao.dominio;

/*
* Neste momento estamos dizendo 
* que um jogador pertence a um time
*/

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.getTime().getNome());
    }
/* o construtor exige que eu tenha um jogador */
    public Jogador (String nome, Time time){
        this.nome = nome;
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

