package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Tomek");

        OrderProcessor orderProcessor = new OrderProcessor(new OrderRepositoryImpl(),new ProductOrderService(), new InformationService());
        orderProcessor.process(new OrderRequest(user1,new Item("Rower",2000,1),1));



    }
}
