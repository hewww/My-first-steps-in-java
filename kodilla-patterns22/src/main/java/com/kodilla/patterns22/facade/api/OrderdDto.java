package com.kodilla.patterns22.facade.api;

import java.util.ArrayList;
import java.util.List;

public class OrderdDto {
    private List<ItemDto> items = new ArrayList<>();

    public void addItem(final ItemDto item) {
        items.add(item);
    }
}
