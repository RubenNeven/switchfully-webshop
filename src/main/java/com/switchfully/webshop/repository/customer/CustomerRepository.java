package com.switchfully.webshop.repository.customer;

import com.switchfully.webshop.domain.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    private final List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList<>();
    }

    public Customer createCustomer(Customer customer){
        customers.add(customer);
        printAllCustomers();
        return customer;
    }

    public void printAllCustomers(){
        customers.stream()
                .forEach(System.out::println);
    }
}
