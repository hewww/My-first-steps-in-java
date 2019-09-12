package com.kodilla.good.patterns.MyImplement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        CocaCola cocaCola = new CocaCola();
        GetProduct getProduct = new GetProduct();

        getProduct.getProducts(cocaCola);

    }
}
