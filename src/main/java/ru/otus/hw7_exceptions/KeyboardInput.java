package ru.otus.hw7_exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

/**
 * Класс получает данные из консоли
 */
public class KeyboardInput {

    /**
     * @return - введенное число или '-1'(если было введено не число)
     */
    public static int getInput() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            int inputNumber = Integer.parseInt(input.readLine());
            if (inputNumber == (int) inputNumber) {
                return inputNumber;
            } else {
                return -1;
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Method return '-1', because - " + e.toString());
        }
        return -1;
    }
}
