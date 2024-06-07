package org.example.dominio.collections.arraylist.teste;

import org.example.dominio.collections.arraylist.CadastroHotel;

public class CadastroHotelTest {

    /**
     * Metodo Main
     *
     * @param args
     */
    public static void main(String[] args) {
        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionaElementoFimLista("Royal Hotel", "São Jose dos Campos", 140.00);
        cadastroHotel.adicionaElementoFimLista("Ibis", "São Paulo", 200.00);
        cadastroHotel.adicionaElementoFimLista("Ibis Star", "Iatjai", 350.00);
        cadastroHotel.adicionaElementoPorIndice(2, "Royal Hotel Indaiatuba", "Indaiatuba", 129.00);

  //      cadastroHotel.buscaHotelPorIndice(0);
        cadastroHotel.existsHoteis("Royal Hotel");
        //       cadastroHotel.obterTodos();
        //       cadastroHotel.buscaTodosHoteis();

    }
}
