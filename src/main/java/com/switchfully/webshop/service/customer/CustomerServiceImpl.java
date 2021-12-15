package com.switchfully.webshop.service.customer;

import com.switchfully.webshop.controller.mapper.CustomerMapper;
import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;
import com.switchfully.webshop.repository.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public Customer createCustomer(CustomerDto customerDto) {
        return customerRepository.createCustomer(customerMapper.mapToCustomer(customerDto));
    }
}
