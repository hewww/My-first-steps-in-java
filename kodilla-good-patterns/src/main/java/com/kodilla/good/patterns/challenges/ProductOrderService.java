package com.kodilla.good.patterns.challenges;


import com.sun.org.apache.xpath.internal.operations.Or;

public class ProductOrderService {

    private OrderRequest orderRequest;

    public ProductOrderService() {

    }


    public boolean order(User user, Item item, Integer ammount) {
        if(ammount > item.getQuantity()){
            System.out.println("Niestety posiadamy tylko " + item.getQuantity() + " szt");
            return false;
        } else {
            System.out.println("Zamówiono");
            return true;
        }

    }
}