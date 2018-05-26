package com.sda.spring.demo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Nie mogę znaleźć kategorii");
    }
}
