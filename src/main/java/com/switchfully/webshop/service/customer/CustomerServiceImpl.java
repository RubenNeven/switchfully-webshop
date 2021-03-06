package com.switchfully.webshop.service.customer;

import com.switchfully.webshop.controller.mapper.CustomerMapper;
import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.controller.dto.CustomerDto;
import com.switchfully.webshop.repository.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        logger.info("Create customer (service) called");
        Customer customer = customerRepository.save(customerMapper.mapToCustomer(customerDto));
        return customerMapper.mapToCustomerDto(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        logger.info("Get all customers (service) called");
        return customerRepository.findAll();
    }

}
