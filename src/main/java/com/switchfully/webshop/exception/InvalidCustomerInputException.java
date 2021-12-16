package com.switchfully.webshop.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.*;

public class InvalidCustomerInputException extends RuntimeException{

    public InvalidCustomerInputException(String message) {
        super(message);
    }
}
