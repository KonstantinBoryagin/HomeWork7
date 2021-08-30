package ru.otus.hw7_exceptions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardInputTest {

    private ByteArrayInputStream in;

    @BeforeEach
    public void init() {
        in = new ByteArrayInputStream("3".getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
    }

    @AfterEach
    public void returnDefault() {
        System.setIn(System.in);
    }

    @Test
    @DisplayName("Test for assert number")
    void getInputTestEquals() {
        int result = 3;
        assertEquals(result, KeyboardInput.getInput());
    }

    @Test
    @DisplayName("Test for not number input")
    void getInputTestNotNumber() {
        in = new ByteArrayInputStream("AbCd".getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
        int result = -1;
        assertEquals(result, KeyboardInput.getInput());
    }

    @Test
    @DisplayName("Test for assert various numbers")
    void getInputTestNotEquals() {
        int result = 100;
        assertNotEquals(result, KeyboardInput.getInput());
    }

    @Test
    @DisplayName("Test for not NULL")
    void getInputTestNotNull() {
        int result = 3;
        assertNotNull(KeyboardInput.getInput());
    }
}