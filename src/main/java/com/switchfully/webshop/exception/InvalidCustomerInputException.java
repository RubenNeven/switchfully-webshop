package com.switchfully.webshop.exception;

public class InvalidCustomerInputException extends RuntimeException{

    public InvalidCustomerInputException(String message) {
        super(message);
    }
}
