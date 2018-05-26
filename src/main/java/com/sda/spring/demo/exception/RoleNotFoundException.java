package com.sda.spring.demo.exception;

public class RoleNotFoundException extends RuntimeException {
    public RoleNotFoundException(Long id) {
        super("Nie mogę znaleźć kategorii");
    }
}
