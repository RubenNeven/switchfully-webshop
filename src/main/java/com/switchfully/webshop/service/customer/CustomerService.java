package com.switchfully.webshop.service.customer;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.controller.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    CustomerDto createCustomer(CustomerDto customerDto);

    List<Customer> getAllCustomers();


}
