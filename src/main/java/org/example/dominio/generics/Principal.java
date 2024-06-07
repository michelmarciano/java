package org.example.dominio.generics;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes =  new ArrayList();
        clientes.add(new Cliente("Supermercado Pague e Leve", 800));
        clientes.add(new Cliente("Posto Gasolina Boa", 500));
      //  clientes.add("MICHEL MARCIANO")

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes){
            totalFaturamento += cliente.getFaturamentoMensal();
        }
        System.out.println(totalFaturamento);

    }

}
