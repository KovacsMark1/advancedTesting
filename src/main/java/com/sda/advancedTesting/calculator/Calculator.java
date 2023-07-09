package com.sda.advancedTesting.calculator;

import com.sda.advancedTesting.calculator.exceptions.TruncatedResultException;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        if (a < Double.MAX_VALUE / b) {
            throw new TruncatedResultException ("Cannot multiply numbers of this size. Result will be truncated. ");
        }
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by 0 is not supported!");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulo by zero is not allowed! ");
        }
        return a % b;
    }

}