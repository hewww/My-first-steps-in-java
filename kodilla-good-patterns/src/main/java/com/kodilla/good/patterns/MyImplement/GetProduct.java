package com.kodilla.good.patterns.MyImplement;


import java.util.List;

public class GetProduct {

    public List getProducts(Producent producent) {
        System.out.println(producent.products().size());
        return producent.products();
    }


}

