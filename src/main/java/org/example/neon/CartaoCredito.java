package org.example.neon;

public class CartaoCredito implements Cartao {

    private String emissor;
    private String setor;
    private String verificador;
    private String conta;


    /*
    #####Contexto:
	Estaremos discutindo números de cartão de crédito. Começaremos com uma representação simplificada.

#####Part 1
	Estaremos analisando strings que representam números de cartões. Nossos números de cartão têm a seguinte estrutura:
  - 16 dígitos
	- Os primeiros 6 dígitos representam o emissor (a empresa que emite o cartão).
		- O primeiro desses dígitos representa o setor do emissor.

	- O último dos dezesseis dígitos é para uma soma de verificação.
	- Os dígitos intermediários representam a conta.

Write:
  Uma estrutura de dados para armazenar as informações do cartão analisadas
  Uma função que pega uma string e a transforma nessa estrutura
  Observação: a próxima pergunta exigirá que calculemos usando os dígitos do cartão, então tenha isso em mente
     */

    @Override
    public void validaCartao(String cartao) {

        emissor = cartao.substring(0, 6);
        setor = cartao.substring(0, 1);
        conta = cartao.substring(6, 16);
        verificador = cartao.substring(16);


        System.out.println("emissor: " + emissor + "setor:" + setor + "conta:" + conta + "verificador" + verificador);
    }

    /*
    Agora vamos implementar o algoritmo de checksum. Aqui está uma visão geral; você não precisa seguir estas etapas exatamente nesta ordem se o resultado estiver correto:
    1. Começando com o primeiro dígito, dobre um sim um não.
    2. Se algum dos números duplicados for 10 ou maior, substitua-o pela soma dos dígitos. (por exemplo, 13 => 1 + 3 = 4)
    3. Some os números resultantes; a soma de verificação passa se for divisível por 10.

    Write:
        Uma função para determinar se um número de cartão (conforme representado pela sua estrutura de dados) passa na soma de verificação

    #####Exemplo:
    4417 1234 5678 9113
    4(x2) 4 1(x2) 7 1(x2) 2 3(x2) 4 5(x2) 6 7(x2) 8 9(x2) 1 1(x2) 3
     8    4 	2 	7   2 	2   6 	4   10 	6  14 	8  18 	1   2 	3
     8 	  4 	2 	7   2 	2   6 	4   1 	6  5 		8  9 		1   2 	3
    70 (divisível por 10, passa na soma de verificação)
     */

    public Boolean calculaCartao(String cartao) {
        int count = 0;
        Integer total = 0;

        for (char c : cartao.toCharArray()) {
            count++;
            Integer valor = Integer.parseInt(String.valueOf(c));

            if(valor > 10){

            }
            if (count % 2 == 1) {
                valor = valor * 2;
            }
            total += valor;
        }
        if (total % 10 == 0){
            return true;

        }
        System.out.println(total);
        return false;

    }

}
