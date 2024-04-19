package org.example.interfaces;

public class Gateway {

    public String order (IOrder order){
        System.out.println("Pagamento " + order);
        return "App";
    }
}
