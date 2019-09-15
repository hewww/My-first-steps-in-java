package com.kodilla.good.patterns.good.patterns.challenges;

import java.util.List;

public class OrderProcessor {
    private OrderRespository orderRespository;
    private ProductOrderService productOrderService;
    private InformationService informationService;

    public OrderProcessor(OrderRespository orderRespository, ProductOrderService productOrderService, InformationService informationService) {
        this.orderRespository = orderRespository;
        this.productOrderService = productOrderService;
        this.informationService = informationService;
    }

    public List<Order> getMyOrders(User user) {
        return orderRespository.getOrdersByUsername(user.getUsername());
    }

    public ProcessedOrder process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getItem(),
                orderRequest.getAmmount());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            System.out.println("Zamówiono " + orderRequest.getItem().getName() + " Ilość " + orderRequest.getAmmount());
            return new ProcessedOrder(orderRequest.getUser(), true);
        } else {
            System.out.println("Brak zamówień");
            return new ProcessedOrder(orderRequest.getUser(), false);
        }
    }

}
