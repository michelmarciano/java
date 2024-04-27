package org.example.composicao;

import org.example.composicao.negocio.ContratoTrabalho;
import org.example.composicao.negocio.FolhaPagamento;
import org.example.composicao.negocio.Funcionario;
import org.example.composicao.negocio.Holerite;

public class Principal {

    public static void main(String[] args) {
        double horasNormaisTrabalhadas = 10;
        double horasExtrasTrabalhadas = 5;

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Mike";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.valorHoraExtra = 60;
        contratoTrabalho.valorHoraNormal = 30;
        contratoTrabalho.funcionario = funcionario;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calculoSalario(horasNormaisTrabalhadas, horasExtrasTrabalhadas, contratoTrabalho);
        holerite.imprimirHolerite();
    }
}
