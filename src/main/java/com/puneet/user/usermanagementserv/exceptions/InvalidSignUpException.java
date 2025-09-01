package com.puneet.user.usermanagementserv.exceptions;

public class InvalidSignUpException extends RuntimeException {
    public InvalidSignUpException(String message) {
        super(message);
    }
}
