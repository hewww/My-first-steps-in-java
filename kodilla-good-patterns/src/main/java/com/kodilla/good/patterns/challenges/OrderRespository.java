package com.kodilla.good.patterns.challenges;

import java.util.List;

public interface OrderRespository {
     List<Order> getOrdersByUsername(String username);

}
