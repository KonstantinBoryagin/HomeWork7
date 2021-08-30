package ru.otus.hw7_exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Main {


    /**
     * Инициализирует дефолтный Logger с конфигурационным файлом
     */
    private static Logger log;
    static {
        try (FileInputStream config = new FileInputStream("/home/nokss/Logger/log.config")) {
            LogManager.getLogManager().readConfiguration(config);
            log = Logger.getLogger(Main.class.getName());
        } catch (Exception ignore) {
            System.out.println("WARNING: Could not open configuration file");
            System.out.println("WARNING: Logging not configured (console output only)");
        }
    }


    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        System.out.println("Enter the number");

        /** Получает число из консоли */
        int inputNumber = KeyboardInput.getInput();
        log.log(Level.INFO, "Number from user received successfully");

        /** Вычисляет факториал для полученного числа и записывает в файл */
        try {
            long result = factorial.getFactorial(inputNumber);
            log.log(Level.INFO, "Factorial combed out");
            WriteToFile.recordToFile(result);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            log.log(Level.WARNING, "Exception: ", e);
        } catch (Exception e) {
            e.printStackTrace();
            log.log(Level.WARNING, "Exception: ", e);
        }
    }
}
