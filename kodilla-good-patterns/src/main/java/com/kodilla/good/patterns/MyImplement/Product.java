package com.kodilla.good.patterns.MyImplement;

public class Product {
    private String name;
    private int quantity;
    private String type;

    public Product(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}
