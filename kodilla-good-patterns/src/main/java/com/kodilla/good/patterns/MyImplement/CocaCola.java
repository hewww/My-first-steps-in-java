package com.kodilla.good.patterns.MyImplement;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CocaCola implements Producent {
    public String companyName;
    public List<Product> products;

    public List<Product> products() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("CocaCola 0,5L",500,"szt"));
        products.add(new Product("CocaCola 1,5L",400,"szt"));
        products.add(new Product("CocaCola 2L",500,"szt"));
        return products;
    }

    @Override
    public boolean process() {
        return true;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Product> getProducts() {
        return products;
    }
}
