package com.switchfully.webshop.controller.customer;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;
import com.switchfully.webshop.repository.customer.CustomerRepository;
import com.switchfully.webshop.service.customer.CustomerService;
import com.switchfully.webshop.service.customer.CustomerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;


class CustomerControllerUnitTest {

/*    @Test
    void givenACustomerDto_whenCreatingACustomer_thenReturnCreatedCustomer() {
        CustomerServiceImpl customerService = Mockito.mock(CustomerServiceImpl.class);

        Customer customer = new Customer("Ruben", "Neven", "rubenneven@gmail.com", "0484/48.29.78");
        Mockito.when(customerService.createCustomer(new CustomerDto()))
                .thenReturn(customer);

        CustomerController customerController = new CustomerController(customerService);
        Assertions.assertEquals(customer, customerController.createCustomer(new CustomerDto()));
    }*/

}