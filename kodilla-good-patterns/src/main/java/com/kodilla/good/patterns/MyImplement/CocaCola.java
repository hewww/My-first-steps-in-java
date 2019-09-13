package com.kodilla.good.patterns.MyImplement;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CocaCola implements Producent {
    public String companyName = "CocaCola";
    public List<Product> products = new ArrayList<>();

    public CocaCola() {
        products.add(new Product("CocaCola 0,5L", 500, "szt"));
        products.add(new Product("CocaCola 1,5L", 400, "szt"));
        products.add(new Product("CocaCola 2L", 500, "szt"));
    }

    @Override
    public boolean process() {
        System.out.println("Process");
        return true;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "CocaCola{" +
                "companyName='" + companyName + '\'' +
                ", products=" + products +
                '}';
    }
}
