package ru.otus.hw7_exceptions;

/**
 * Класс исключение
 * @see Factorial
 */
public class FactorialException extends Exception{
    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialException (String message, int num) {
        super(message);
        number = num;
    }

}
