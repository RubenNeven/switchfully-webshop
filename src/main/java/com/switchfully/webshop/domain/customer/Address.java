package com.switchfully.webshop.domain.customer;

import java.util.UUID;

public class Address {
    private String id;
    private String street;
    private String houseNumber;
    private String city;
    private String zipCode;
    private String country;

    public Address(String street, String houseNumber, String city, String zipCode, String country) {
        this.id = UUID.randomUUID().toString();
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }
}
