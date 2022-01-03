package com.switchfully.webshop.domain.customer;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "STREET")
    private String street;
    @Column(name = "HOUSENUMBER")
    private String houseNumber;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIP_CODE")
    private String zipCode;
    @Column(name = "COUNTRY")
    private String country;

    public Address(String street, String houseNumber, String city, String zipCode, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public Address() {

    }

    public Long getId() {
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
