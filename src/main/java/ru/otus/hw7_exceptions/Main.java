package ru.otus.hw7_exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static Logger log;
    // ????
    static {
        try (FileInputStream config = new FileInputStream("/home/nokss/Logger/log.config")) {
            LogManager.getLogManager().readConfiguration(config);
            log = Logger.getLogger(Main.class.getName());
        } catch (Exception ignore) {
            System.out.println("WARNING: Could not open configuration file");
            System.out.println("WARNING: Logging not configured (console output only)");
        }
    }

    public static void someMethod() {
        log.log(Level.WARNING, "Start someMethod");
        System.out.println("-----");
        log.log(Level.SEVERE, "Stop someMethod");
    }

    public static void main(String[] args) {
        Main.someMethod();
        log.log(Level.FINE, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        try {
            throw new FactorialException("ASSSSAAA", 10);
        } catch (FactorialException e) {
            log.log(Level.WARNING,"Exception: ", e);
            System.out.println("Exception write in log");
        }


//        Factorial factorial = new Factorial();
//        System.out.println("Enter the number");
//
//        /** Получает число из консоли */
//        int inputNumber = KeyboardInput.getInput();
//
//        /** Вычисляет факториал для полученного числа и записывает в файл */
//        try {
//            long result = factorial.getFactorial(inputNumber);
//            WriteToFile.recordToFile(result);
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
