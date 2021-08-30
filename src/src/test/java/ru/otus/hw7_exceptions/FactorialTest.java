package ru.otus.hw7_exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Test for throw Exception")
    void getFactorialException() {
        assertThrows(Exception.class,
                () -> {
                    factorial.getFactorial(0);
                });
    }

    @Test
    @DisplayName("Test for correct operation")
    void getFactorialTest() throws Exception {
        long expected = 362880;
        assertEquals(expected, factorial.getFactorial(9));
    }

    @Test
    @DisplayName("Test for wrong operation")
    void getFactorialTestWrong() throws Exception {
        long expected = 123;
        assertNotEquals(expected, factorial.getFactorial(9));
    }
}