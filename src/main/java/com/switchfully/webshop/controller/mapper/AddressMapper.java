package com.switchfully.webshop.controller.mapper;

import com.switchfully.webshop.domain.customer.Address;
import com.switchfully.webshop.domain.customer.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address mapToAddress(AddressDto addressDto){
        return new Address(
                addressDto.getStreet(),
                addressDto.getHouseNumber(),
                addressDto.getCity(),
                addressDto.getZipCode(),
                addressDto.getCountry()
        );
    }

    public AddressDto mapToAddressDomain(Address address){
        return new AddressDto()
                .setId(address.getId())
                .setStreet(address.getStreet())
                .setCity(address.getCity())
                .setZipCode(address.getZipCode())
                .setCountry(address.getCountry());
    }
}
