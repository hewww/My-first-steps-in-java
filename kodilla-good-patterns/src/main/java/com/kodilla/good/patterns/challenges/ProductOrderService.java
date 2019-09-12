package com.kodilla.good.patterns.challenges;


public class ProductOrderService {

    private Order order;
    private OrderProcessor orderProcessor;
    private OrderRespository orderRespository;

    public ProductOrderService(final Order order,
                               final OrderProcessor orderProcessor,
                               final OrderRespository orderRespository) {
        this.order = order;
        this.orderProcessor = orderProcessor;
        this.orderRespository = orderRespository;
    }
}