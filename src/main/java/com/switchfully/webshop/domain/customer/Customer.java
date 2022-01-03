package com.switchfully.webshop.domain.customer;

import com.switchfully.webshop.exception.InvalidCustomerInputException;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "CUSTOMERS")
@NoArgsConstructor
public class Customer {

    @Id
    private String id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    public Customer(String firstName, String lastName, String emailAddress, String phoneNumber, Address address) {
        this.id = UUID.randomUUID().toString();
        if (!isValidUserInput(firstName)) {
            throw new InvalidCustomerInputException("Please fill in firstname");}
        if (!isValidUserInput(lastName)) {
            throw new InvalidCustomerInputException("Please fill in lastname");}
        if (!isValidUserInput(emailAddress)) {
            throw new InvalidCustomerInputException("Please fill in emailaddress");}
        if (!isValidUserInput(phoneNumber)) {
            throw new InvalidCustomerInputException("Please fill in phonenumber");}
        if (!isValidUserInput(address.getCity())) {
            throw new InvalidCustomerInputException("Please fill in city");}
        if (!isValidUserInput(address.getHouseNumber())) {
            throw new InvalidCustomerInputException("Please fill in house number");}
        if (!isValidUserInput(address.getCountry())) {
            throw new InvalidCustomerInputException("Please fill in country");}
        if (!isValidUserInput(address.getStreet())) {
            throw new InvalidCustomerInputException("Please fill in street");}
        if (!isValidUserInput(address.getZipCode())) {
            throw new InvalidCustomerInputException("Please fill in zipcode");}
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }



    private boolean isValidUserInput(String inputString) {
        return inputString != null;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
