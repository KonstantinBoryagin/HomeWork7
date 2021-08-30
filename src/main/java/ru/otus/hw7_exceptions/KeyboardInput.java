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
     * Метод считывает и возвращает введенные пользователем данные
     * @return - введенное число или '-1'(если было введено не число)
     */
    public static int getInput() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            return Integer.parseInt(input.readLine());
        } catch (IOException | NumberFormatException e) {
           System.out.println("Exception - " + e);
        }
        return -1;
    }
}
