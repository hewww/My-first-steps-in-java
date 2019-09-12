package com.kodilla.good.patterns.challenges;

        import java.util.List;

public class OrderProcessor {
    private OrderRespository orderRespository;

    public OrderProcessor(OrderRespository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public List<Order> getMyOrders(User user) {
        return orderRespository.getOrdersByUsername(user.getUsername());
    }
}
