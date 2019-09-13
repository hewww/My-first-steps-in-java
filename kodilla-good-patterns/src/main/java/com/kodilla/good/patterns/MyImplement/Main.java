package com.kodilla.good.patterns.MyImplement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProducentFactory producentFactory = new ProducentFactory();
        List<Producent> producentsList = new ArrayList<>();
        producentsList.add(producentFactory.generateProducent("CocaCola"));

        System.out.println(producentsList.get(0));






    }
}
