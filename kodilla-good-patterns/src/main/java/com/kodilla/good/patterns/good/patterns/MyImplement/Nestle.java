package com.kodilla.good.patterns.good.patterns.MyImplement;

import java.util.ArrayList;
import java.util.List;

public class Nestle implements Producent {
    public String companyName = "Nestle";
    public List<Product> products = new ArrayList<>();

    public Nestle() {
        products.add(new Product("Nestle 0,5L", 500, "szt"));
        products.add(new Product("Nestle 1,5L", 400, "szt"));
        products.add(new Product("Nestle 2L", 500, "szt"));
    }

    @Override
    public boolean process() {
        System.out.println("Nestle Process");
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
        return "Nestle{" +
                "companyName='" + companyName + '\'' +
                ", products=" + products +
                '}';
    }
}
