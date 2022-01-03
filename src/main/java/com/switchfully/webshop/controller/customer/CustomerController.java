package com.switchfully.webshop.controller.customer;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.controller.dto.CustomerDto;
import com.switchfully.webshop.service.customer.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @ResponseStatus(CREATED)
    public CustomerDto createCustomer(@RequestBody CustomerDto customerDto){
        logger.info("Create customer (controller) called");
        return customerService.createCustomer(customerDto);
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(OK)
    @PreAuthorize("hasAuthority('GET_ALL_CUSTOMERS')")
    public List<Customer> getAllCustomers(){
        logger.info("Get all customer (controller) called");
        return customerService.getAllCustomers();
    }
}
