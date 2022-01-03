package com.switchfully.webshop.controller.customer;


import com.switchfully.webshop.domain.customer.Address;
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

        CustomerDto customerDto = new CustomerDto()
                .setId("1")
                .setFirstName("Ruben")
                .setLastName("Neven")
                .setEmailAddress("rubenneven@gmail.com")
                .setAddress(new Address("Pelserweg", "5", "Diepenbeek", "3590", "Belgium"))
                .setPhoneNumber("0484/48.29.78");

        Mockito.when(customerService.createCustomer(any(CustomerDto.class))).thenReturn(customerDto);

        CustomerController customerController = new CustomerController(customerService);
        Assertions.assertEquals(customerDto, customerController.createCustomer(new CustomerDto()));
    }

}
