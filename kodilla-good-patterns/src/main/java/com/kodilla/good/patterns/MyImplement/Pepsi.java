package com.kodilla.good.patterns.MyImplement;

import java.util.ArrayList;
import java.util.List;

public class Pepsi implements Producent {
    public String companyName = "Pepsi";
    public List<Product> products = new ArrayList<>();

    public Pepsi() {
        products.add(new Product("Pepsi 0,5L", 500, "szt"));
        products.add(new Product("Pepsi 1,5L", 400, "szt"));
        products.add(new Product("Pepsi 2L", 500, "szt"));
    }

    @Override
    public boolean process() {
        System.out.println("Pepsi Process");
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
        return "Pepsi{" +
                "companyName='" + companyName + '\'' +
                ", products=" + products +
                '}';
    }
}