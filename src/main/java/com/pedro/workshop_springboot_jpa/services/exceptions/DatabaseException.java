package com.pedro.workshop_springboot_jpa.services.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DatabaseException(String message) {
        super(message);
    }
}
