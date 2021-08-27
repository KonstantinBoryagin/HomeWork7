package ru.otus.hw7_exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardInput {
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public BufferedReader getInput() {
        return input;
    }
}
