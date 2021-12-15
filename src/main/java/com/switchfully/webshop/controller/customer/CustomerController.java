package com.switchfully.webshop.controller.customer;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;
import com.switchfully.webshop.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseStatus(CREATED)
    public Customer createCustomer(@RequestBody CustomerDto customerDto){
        return customerService.createCustomer(customerDto);
    }
}
