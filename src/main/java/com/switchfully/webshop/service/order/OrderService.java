package com.switchfully.webshop.service.order;

import com.switchfully.webshop.controller.dto.OrderDto;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);
}
