package org.example.composicao.negocio;

public class ContratoTrabalho {
    public Funcionario funcionario;
    public double valorHoraNormal;
    public double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }

}
