package org.example.dominio.generics.algaworks;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {

    public static void main(String[] args) {
        ArrayList clientes = new ArrayList();
        clientes.add(new Cliente("Supermercado Pague e Leve", 100_00));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_00));

       double totalFaturamento = 0d;

       for (Object objeto: clientes){
           Cliente cliente = (Cliente) objeto;

           totalFaturamento += cliente.getFaturamentoMensal();
       }

       System.out.println(totalFaturamento);
    }
}
