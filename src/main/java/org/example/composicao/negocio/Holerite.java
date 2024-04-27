package org.example.composicao.negocio;

public class Holerite {
    public Funcionario funcionario;
    public double valorTotalHorasNormais;
    public double valorTotalHorasExtras;
    public double adicionalParaFilhos;

    public double calculaTotalReceber(){
      return valorTotalHorasNormais + valorTotalHorasExtras + adicionalParaFilhos;
    }

    public void imprimirHolerite(){
        System.out.println("***************************************");
        System.out.println("*************HOLERITE******************");
        System.out.printf("FUNCIONARIO: %s%n", funcionario.nome);
        System.out.printf("TOTAl HORAS EXTRAS: %f%n", valorTotalHorasExtras);
        System.out.printf("TOTAl HORAS NORMAIS: %f%n", valorTotalHorasNormais);
        System.out.printf("TOTAl ADICIONAL FILHOS: %f%n", adicionalParaFilhos);
        System.out.printf("TOTAl A RECEBER: %f%n", calculaTotalReceber());

    }
}
