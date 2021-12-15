package com.switchfully.webshop.service.customer;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;

public interface CustomerService {

    Customer createCustomer(CustomerDto customerDto);
}
