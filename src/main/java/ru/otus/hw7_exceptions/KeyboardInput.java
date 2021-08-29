package ru.otus.hw7_exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс получает данные из консоли
 */
public class KeyboardInput {

    /**
     * @return - введенное число или '-1' (если было получено не число)
     */
    public static int getInput() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            int inputNumber = Integer.parseInt(input.readLine());
            if (inputNumber == (int) inputNumber) {
                return inputNumber;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
