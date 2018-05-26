package com.sda.spring.demo.exception;

public class AuthorNotFoundException extends RuntimeException {
    public AuthorNotFoundException(Long id) {
        super("Nie mogę znaleźć autora");
    }
}
