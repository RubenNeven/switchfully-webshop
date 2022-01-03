package com.switchfully.webshop.service.order;

import com.switchfully.webshop.controller.dto.OrderDto;
import com.switchfully.webshop.service.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final ItemService itemService;

    @Autowired
    public OrderServiceImpl(ItemService itemService) {
        this.itemService = itemService;
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        return null;
    }
}
