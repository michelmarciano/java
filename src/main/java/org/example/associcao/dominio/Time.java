package org.example.associcao.dominio;

public class Time {
    private String nome;


    public Time(String nome){
      this.nome = nome;
    }

    public String getNome(){
      return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
