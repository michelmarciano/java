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

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Mike";
        funcionario2.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho2 = new ContratoTrabalho();
        contratoTrabalho2.valorHoraExtra = 60;
        contratoTrabalho2.valorHoraNormal = 30;
        contratoTrabalho2.funcionario = funcionario2;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        FolhaPagamento folhaPagamento2 = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calculoSalario(horasNormaisTrabalhadas, horasExtrasTrabalhadas, contratoTrabalho);
        Holerite holerite2 = folhaPagamento2.calculoSalario(horasNormaisTrabalhadas, horasExtrasTrabalhadas, contratoTrabalho2);

        holerite.imprimirHolerite();
        holerite2.imprimirHolerite();

    }
}
