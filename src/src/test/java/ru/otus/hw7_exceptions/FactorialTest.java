package ru.otus.hw7_exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void init() {
        factorial = new Factorial();
    }

    @Test
    void getFactorial() {
        assertThrows(Exception.class,
                () -> {
                    factorial.getFactorial(0);
                });
    }
}