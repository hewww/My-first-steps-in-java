package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Order {
    private String username;
    private Integer orderId;
    private Item item;
    private boolean payment;
    private boolean send;

    public Order(String username, Integer orderId, Item item, boolean payment, boolean send) {
        this.username = username;
        this.orderId = orderId;
        this.item = item;
        this.payment = payment;
        this.send = send;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getItemName() {
        return item.getName();
    }

    public boolean isPayment() {
        return payment;
    }

    public boolean isSend() {
        return send;
    }


    @Override
    public int hashCode() {
        return Objects.hash(orderId, item, payment, send);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", name='" + item.toString() + '\'' +
                ", payment=" + payment +
                ", send=" + send +
                '}';
    }
}
