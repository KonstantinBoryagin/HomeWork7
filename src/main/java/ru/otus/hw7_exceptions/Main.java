package ru.otus.hw7_exceptions;


import java.io.FileNotFoundException;

public class Main {

//    private static Logger log = Logger.getLogger(Main.class.getName());
//    public void logLog() {
//        log.info("Hi, I'm logger");
//    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Enter the number");

        /** Получает число из консоли */
        int inputNumber = KeyboardInput.getInput();

        /** Вычисляет факториал для полученного числа и записывает в файл */
        try {
            long result = factorial.getFactorial(inputNumber);
            WriteToFile.recordToFile(result);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
