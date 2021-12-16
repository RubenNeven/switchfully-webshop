package com.switchfully.webshop.controller.customer;


import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;
import com.switchfully.webshop.service.customer.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

class CustomerControllerUnitTest {

    @Test
    void givenACustomerDto_whenCreatingACustomer_thenReturnCreatedCustomer() {
        CustomerService customerService = Mockito.mock(CustomerService.class);

        Customer customer = new Customer("Ruben", "Neven", "rubenneven@gmail.com", "0484/48.29.78");
        Mockito.when(customerService.createCustomer(any(CustomerDto.class))).thenReturn(customer);

        CustomerController customerController = new CustomerController(customerService);
        Assertions.assertEquals(customer, customerController.createCustomer(new CustomerDto()));
    }

}