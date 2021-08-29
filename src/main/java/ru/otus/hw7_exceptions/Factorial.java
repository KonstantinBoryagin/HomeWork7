package ru.otus.hw7_exceptions;

/**
 * Класс вычисляет факториала числа
 */
public class Factorial {

    /**
     * Метод получает число и вызывает {@link #getFactorial(int)} для вычисления факториала
     * @param number - число для которого нужно вычислить факториал
     * @return - факториал числа
     * @throws Exception - оборачивает {@link FactorialException#FactorialException(String, int)}
     */
    public long getFactorial(int number) throws Exception {
        try {
            return calculateFactorial(number);
        } catch (FactorialException e) {
            throw new Exception(e);
        }
    }

    /**
     * Метод вычисляет факториал для полученного числа
     * @param num - число для которого нужно вычислить факториал
     * @return - факториал числа
     * @throws FactorialException - исключение если число меньше 1
     */
    private long calculateFactorial(int num) throws FactorialException {
        long result = 1;

        if (num < 1) {
            throw new FactorialException("The number is less than 1", num);
        }

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
