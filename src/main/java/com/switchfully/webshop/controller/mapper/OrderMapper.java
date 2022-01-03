package com.switchfully.webshop.controller.mapper;

import com.switchfully.webshop.controller.dto.OrderDto;
import com.switchfully.webshop.domain.order.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order mapToDomain(OrderDto orderDto){
        return new Order(
                orderDto.getCustomer(),
                orderDto.getTotalOrderPrice()
        );
    }

    public OrderDto mapToDto(Order order){
        return new OrderDto()
                .setId(order.getId())
                .setCustomer(order.getCustomer())
                .setTotalOrderPrice(order.getTotalOrderPrice());
    }
}
