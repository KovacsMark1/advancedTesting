package com.sda.advancedTesting.calculator;

import com.sda.advancedTesting.calculator.exceptions.TruncatedResultException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class CalculatorTest {


    @Test
    void verifyAdd() {

        //Given
        double a = 20;
        double b = 32;
        Calculator calculator = new Calculator();

        //When
        double result = calculator.add(a, b);

        //Then
        assertEquals(52, result);


    }

    @Test
    void verifySubtract() {

        //Given
        double a = 20;
        double b = 32;
        Calculator calculator = new Calculator();

        //When
        double result = calculator.subtract(a, b);

        //Then
        assertEquals(-12, result);


    }

    @Test
    void verifyMultiply() {

        //Given
        double a = 2;
        double b = 3;
        Calculator calculator = new Calculator();

        //When
        double result = calculator.multiply(a, b);

        //Then
        assertEquals(6, result);


    }

    @Test
    void verifyDivide() {

        //Given
        double a = 15;
        double b = 30;
        Calculator calculator = new Calculator();

        //When
        double result = calculator.divide(a, b);

        //Then
        assertEquals(0.5, result);


    }

    @Test
    void verifyModulo() {

        //Given
        int a = 3;
        int b = 5;
        Calculator calculator = new Calculator();

        //When
        int result = calculator.modulo(a, b);

        //Then
        assertEquals(3, result);


    }

    @Test
    void multiplyThrowsTruncatedResultException() {

        //Given
        double a = 1000;
        double b = Double.MAX_VALUE / (a - 1);
        Calculator calculator = new Calculator();

        //When Then
        assertThatExceptionOfType(TruncatedResultException.class)
                .isThrownBy(

                        //lambda (parametrii) -> {cod}
                        () -> calculator.multiply(a, b)
                );

    }

    @Test
    void divideIllegalArgumentException() {

        //Given
        double a = 10;
        double b = 0;
        Calculator calculator = new Calculator();

        //When Then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(
                        () -> calculator.divide(a, b)
                )
                .withMessage("Division by 0 is not supported!");
    }
// To do :
    // @TEST la modulo!!

}
