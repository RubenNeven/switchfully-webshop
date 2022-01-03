package com.switchfully.webshop.domain.order;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.item.ItemGroup;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "CUSTOMER")
    private Customer customer;


    @Column(name = "TOTAL_ORDER_PRICE")
    private double totalOrderPrice;

    public Order(Customer customer,  double totalOrderPrice) {
        this.id = UUID.randomUUID().toString();
        this.customer = customer;
        this.totalOrderPrice = totalOrderPrice;
    }

    public Order() {

    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }


    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }
}
