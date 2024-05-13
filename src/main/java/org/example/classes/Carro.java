package org.example.classes;

public class Carro {

    public static final double TAXA_IPVA = 0.04;
    public String fabricante;
    public String modelo;
    public String cor;
    public int anoFabricacao;
    public Pessoa proprietario;
    public double ipva;
    public double valor;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public void imprimeResumoCarro(){
        System.out.printf("O Ano do carro é:%s%n ", anoFabricacao);
        System.out.printf("O Fabricante do carro é:%s%n ", fabricante);
    }

    public double calculaIpva(){
       return this.ipva = this.valor * TAXA_IPVA;
    }
}


