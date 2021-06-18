package com.demoblaze.automation.exceptions;

public class Exceptions extends AssertionError{

    public static final String electronicComponentNotFound = "Electronic component not found in the indicated category";

    public Exceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
