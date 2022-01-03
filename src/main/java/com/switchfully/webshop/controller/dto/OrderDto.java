package com.switchfully.webshop.controller.dto;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.item.ItemGroup;

import java.util.List;

public class OrderDto {

    private String id;
    private Customer customer;
    private List<ItemGroup> items;
    private double totalOrderPrice;

    public OrderDto setId(String id) {
        this.id = id;
        return this;
    }

    public OrderDto setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderDto setItems(List<ItemGroup> items) {
        this.items = items;
        return this;
    }

    public OrderDto setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
        return this;
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<ItemGroup> getItems() {
        return items;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }
}
