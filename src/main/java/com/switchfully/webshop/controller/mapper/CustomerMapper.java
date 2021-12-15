package com.switchfully.webshop.controller.mapper;

import com.switchfully.webshop.domain.customer.Customer;
import com.switchfully.webshop.domain.customer.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private final AddressMapper addressMapper;

    @Autowired
    public CustomerMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public Customer mapToCustomer(CustomerDto customerDto){
        return new Customer(
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getEmailAddress(),
                addressMapper.mapToAddress(customerDto.getAddressDto()),
                customerDto.getPhoneNumber());
    }

    public CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto()
                .setId(customer.getId())
                .setFirstName(customer.getFirstName())
                .setLastName(customer.getLastName())
                .setEmailAddress(customer.getEmailAddress())
                .setAddressDto(addressMapper.mapToAddressDomain(customer.getAddress()))
                .setPhoneNumber(customer.getPhoneNumber());
    }
}