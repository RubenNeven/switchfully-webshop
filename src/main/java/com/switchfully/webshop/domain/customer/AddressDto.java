package com.switchfully.webshop.domain.customer;

public class AddressDto {
    private String id;
    private String street;
    private String houseNumber;
    private String city;
    private String zipCode;
    private String country;

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

    public AddressDto setId(String id) {
        this.id = id;
        return this;
    }

    public AddressDto setStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressDto setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public AddressDto setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressDto setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public AddressDto setCountry(String country) {
        this.country = country;
        return this;
    }
}
