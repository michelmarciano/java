package org.example.dominio.collections.arraylist;

import java.util.ArrayList;

public class CadastroHotel {

    ArrayList<Hotel> hoteis = new ArrayList(20);

    /**
     * Adiciona novo Hotel
     *
     * @param nome
     * @param cidade
     * @param precoDiaria
     */
    public void adicionaElementoFimLista(String nome, String cidade, double precoDiaria) {
        hoteis.add(new Hotel(nome, cidade, precoDiaria));

    }

    public void adicionaElementoPorIndice(int indice, String nome, String cidade, double precoDiaria){
        hoteis.add(indice, new Hotel(nome, cidade, precoDiaria));
    }

    public ArrayList obterTodos() {
        return hoteis;
    }

    public void existsHoteis(String hoteis){
        System.out.println(hoteis.contains(hoteis));
      ;
    }

    /**
     * Buscando Objeto pelo indice
     *
     * @param indice
     * @return
     */
    public Hotel buscaHotelPorIndice(int indice) {
        return hoteis.get(indice);
    }

    public void buscaTodosHoteis() {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n ",
                    hotel.getNome(),
                    hotel.getCidade(),
                    hotel.getPrecoDiaria());
        }
    }



}
