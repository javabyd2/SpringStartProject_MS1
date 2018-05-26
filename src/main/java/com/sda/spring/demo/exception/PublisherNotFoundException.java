package com.sda.spring.demo.exception;

public class PublisherNotFoundException extends RuntimeException {
    public PublisherNotFoundException(Long id) {
        super("Nie mogę znaleźć kategorii");
    }
}
