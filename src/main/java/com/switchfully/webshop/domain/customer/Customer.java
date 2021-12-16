package com.switchfully.webshop.domain.customer;

import com.switchfully.webshop.exception.InvalidCustomerInputException;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "CUSTOMERS")
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String id;
    @Column(name = "FIRST_NAME")
    private  String firstName;
    @Column(name = "LAST_NAME")
    private  String lastName;
    @Column(name = "EMAIL")
    private  String emailAddress;
    @Transient
    private Address address;
    @Column(name = "PHONE")
    private  String phoneNumber;

    public Customer(String firstName, String lastName, String emailAddress, String phoneNumber) {
        this.id = UUID.randomUUID().toString();
        if (firstName == null){
            throw new InvalidCustomerInputException("Please fill in firstname");
        } else if (lastName == null){
            throw new InvalidCustomerInputException("Please fill in lastname");
        } else if (emailAddress == null){
            throw new InvalidCustomerInputException("Please fill in emailaddress");
        } else if (phoneNumber == null){
            throw new InvalidCustomerInputException("Please fill in phonenumber");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
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
