package com.test.usersinteraction.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String errMessage) {
        super(errMessage);
    }
}
