package org.example.estruturadedados.arrays;


public class Array<T> {

    private T[] listaNomes;
    private int ponteiro;

    /**
     * Construtor
     *
     * @param capacidade
     */
    public Array(int capacidade) {
        listaNomes = (T[]) new Object[capacidade];
    }

    public Array() {
        this(10);
    }

    /**
     * Esse método é mais performatico porque controlamos o indice disponivel
     * com um ponteiro, neste caso o acesso é direto
     *
     * @param nome
     */
    public void adicionaNomeComPonteiro(T nome) {
        aumentaCapacidade();
        listaNomes[ponteiro] = nome;
        ponteiro++;
    }

    /**
     * Esse método não é performatico porque é necessário percorrer
     * toda a lista para saber qual posição está vazia
     *
     * @param nome
     */
    public void adiciona(T nome) {
        aumentaCapacidade();
        for (int i = 0; i < listaNomes.length; i++) {
            if (listaNomes[i] == null) {
                listaNomes[i] = nome;
                break;
            }
        }
    }

    public void adiciona(int posicao, T elemento) {
        aumentaCapacidade();
        //lista = 0,1,7,3,4,5
        //mover elementos
        //        2,3,4,5              2
        for (int i = ponteiro - 1; i >= posicao; i--) {
            //listaNomes[i+1] = 4, 5, 6
            //valor =           3, 4, 5
            listaNomes[i + 1] = listaNomes[i];
        }
        listaNomes[posicao] = elemento;
        ponteiro++;
    }


    /**
     * Busca elemento pelo indice indicado
     *
     * @param indice
     * @return
     */
    public void buscaElementoPorIndice(int indice) throws Exception {
        if (!(indice >= 0 && indice < listaNomes.length)) {
            throw new IllegalArgumentException("posição invalida");
        }
        if (listaNomes[indice] == null) {
            throw new Exception("Elemento não encontrado");
        }
        System.out.println("Encontrei: " + listaNomes[indice]);
    }

    private void aumentaCapacidade() {
        if (ponteiro == listaNomes.length) {
            T[] novoElemento = (T[]) new Object[(listaNomes.length * 2)];

            for (int i = 0; i < listaNomes.length; i++) {
                novoElemento[i] = listaNomes[i];
            }
            this.listaNomes = novoElemento;
        }
    }

    /**
     * Imprime todos os elementos da lista
     */
    public void getListaNomes() {
        System.out.println("---------Lista --------");
        for (int i = 0; i < listaNomes.length; i++) {
            if (listaNomes[i] != null) {
                System.out.println("posicao: " + (i) + " valor " + listaNomes[i]);
            }
        }
    }

    /**
     * Verifica se elemento existe
     */
    public void existsElemento(T elemento) {
        for (int i = 0; i < ponteiro; i++) {
            if (listaNomes[i].equals(elemento)) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }

    /**
     * Metodo Principal
     *
     * @param args
     */
    public static void main(String[] args) {

        Array<Integer> array = new Array(2);

        array.adicionaNomeComPonteiro(0);
        array.adicionaNomeComPonteiro(1);
        array.adicionaNomeComPonteiro(3);

//
//
//        try {
//            array.buscaElementoPorIndice(4);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        //       array.existsElemento("Michel");

        array.adiciona(2, 2);
        array.getListaNomes();
    }


}
