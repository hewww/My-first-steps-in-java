package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRespository {

    @Override
    public List<Order> getOrdersByUsername(String username) {
        if(username.equals("Tomek")) {
            List<Order> orders = new ArrayList<>();
            orders.add(new Order("Tomek", 8475, new Item("Tshirt",199),true,true));
            return orders;
        }
        return null;
    }
}
