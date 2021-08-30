package ru.otus.hw7_exceptions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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
    @DisplayName("Test assert number")
    void getInputTestEquals() {
        int result = 3;
        assertEquals(result, KeyboardInput.getInput());
    }

//    @Test
//    @DisplayName("Test assert number")
//    void getInputTestEqualsNotNumber() throws IOException {
////        ByteArrayInputStream in = new ByteArrayInputStream("AbCd".getBytes(StandardCharsets.UTF_8));
////        System.setIn(in);
//        assertThrows(IOException.class,
//                ()->{
//                    ByteArrayInputStream in = new ByteArrayInputStream("AbCd".getBytes(StandardCharsets.UTF_8));
//                    System.setIn(in);
//                });
//
//        System.setIn(System.in);
//    }

    @Test
    void getInputTestNotEquals() {
        int result = 100;
        assertNotEquals(result, KeyboardInput.getInput());
    }

    @Test
    void getInputTestNotNull() {
        int result = 3;
        assertNotNull(KeyboardInput.getInput());
    }
}