package com.sda.advancedTesting.calculator.exceptions;

public class TruncatedResultException extends RuntimeException{

    public TruncatedResultException(String message) {
        super(message);
    }
}
