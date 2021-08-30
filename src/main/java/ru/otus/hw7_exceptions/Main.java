package ru.otus.hw7_exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
            System.out.println("WARNING: Logging not configured");
        }
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        System.out.print("Enter the number - ");

        /** Получает число из консоли */
        int inputNumber = KeyboardInput.getInput();

        /** Записывает в лог результат работы {@link KeyboardInput#getInput()} */
        if (inputNumber == -1) {
            log.log(Level.WARNING, "KeyboardInput.getInput() return '-1' because no number was entered \n");
        } else {
            log.log(Level.INFO, "Number from user received successfully \n");
        }

        /** Вычисляет факториал для полученного числа и записывает в файл */
        try {
            long result = factorial.getFactorial(inputNumber);
            log.log(Level.INFO, "Factorial combed out \n");

            WriteToFile.recordToFile(result);
            log.log(Level.INFO, "File written successfully \n");
        } catch (FileNotFoundException e) {
            System.out.println("Exception - " + e.getMessage());
            log.log(Level.WARNING, "Exception: ", e);
        } catch (Exception e) {
            e.printStackTrace();
            log.log(Level.SEVERE, "Exception: ", e);
        }
    }
}
