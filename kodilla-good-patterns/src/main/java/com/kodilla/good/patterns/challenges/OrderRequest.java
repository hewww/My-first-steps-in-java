package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private Item item;
    private Integer ammount;

    public OrderRequest(User user, Item item, Integer ammount) {
        this.user = user;
        this.item = item;
        this.ammount = ammount;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public Integer getAmmount() {
        return ammount;
    }
}
