package com.switchfully.webshop.controller.mapper;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.controller.dto.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer mapToCustomer(CustomerDto customerDto){
        return new Customer(
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getEmailAddress(),
                customerDto.getPhoneNumber(),
                customerDto.getAddress());
    }

    public CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto()
                .setId(customer.getId())
                .setFirstName(customer.getFirstName())
                .setLastName(customer.getLastName())
                .setEmailAddress(customer.getEmailAddress())
                .setPhoneNumber(customer.getPhoneNumber())
                .setAddress(customer.getAddress());
    }
}
