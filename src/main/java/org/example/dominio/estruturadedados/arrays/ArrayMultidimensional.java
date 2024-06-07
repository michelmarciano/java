package org.example.dominio.estruturadedados.arrays;

public class ArrayMultidimensional {
    /**
     * Valores default array
     * byte, short, int, long, float e double 0
     * char '\u0000' ''
     * boolean false
     * String null
     */
    public static void main(String[] args) {

        /**
         * declaração array com inicialização valores
         */
        int [][] notas = {{10,9,8,7},{5,5,10,6}};

        /**
         * declaração array com inicialização valores default
         */
        int [][] dias = new int[4][2];
        int soma;
        int media = 0;

        dias[0][0] = 8;
        dias[0][1] = 10;
        dias[1][0] = 10;
        dias[1][1] = 10;
        dias[2][0] = 5;
        dias[2][1] = 7;
        dias[3][0] = 8;
        dias[3][1] = 8;

        /**
         * for com contador
         */
        for (int i=0; i< dias.length; i++){
            soma = 0;
            int aluno = i+1;
            for (int j=0; j < dias[i].length; j++){
                 soma +=  dias[i][j];
                 media = dias[i].length;
            }
            System.out.println("Media notas ds aluno " + aluno + " é " + (soma/media ));
            System.out.println("-------------------------------------- ");

        }

        /**
         * for melhorado
         */
        for(int[] arrBase :dias){
            for (int dia: arrBase){
                System.out.println(dia);
            }
        }

    }
}
