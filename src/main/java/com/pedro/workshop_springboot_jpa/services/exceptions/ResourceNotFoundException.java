package com.pedro.workshop_springboot_jpa.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. id  " + id);
    }
}
