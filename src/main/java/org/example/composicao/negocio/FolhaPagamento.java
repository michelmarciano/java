package org.example.composicao.negocio;

public class FolhaPagamento {
    public Holerite calculoSalario(double horasNormaisTrabalhadas, double horasExtrasTrabalhadas, ContratoTrabalho contratoTrabalho) {
        Holerite holerite = new Holerite();

        holerite.valorTotalHorasExtras = horasExtrasTrabalhadas * contratoTrabalho.valorHoraExtra;
        holerite.valorTotalHorasNormais = horasNormaisTrabalhadas * contratoTrabalho.valorHoraNormal;
        holerite.funcionario = contratoTrabalho.funcionario;

        double totalReceber =  holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if(contratoTrabalho.funcionario.possuiFilhos()){
            holerite.adicionalParaFilhos =  totalReceber * 0.10;
        }

        return holerite;
    }

}
