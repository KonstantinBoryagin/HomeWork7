package ru.otus.hw7_exceptions;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardInputTest {

    @Test
    void getInputTestEquals() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
        int result = 3;
        assertEquals(result, KeyboardInput.getInput());
        System.setIn(System.in);
    }

    @Test
    void getInputTestNotEquals() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
        int result = 100;
        assertNotEquals(result, KeyboardInput.getInput());
        System.setIn(System.in);
    }

    @Test
    void getInputTestNotNull() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
        int result = 3;
        assertNotNull(KeyboardInput.getInput());
        System.setIn(System.in);
    }
}