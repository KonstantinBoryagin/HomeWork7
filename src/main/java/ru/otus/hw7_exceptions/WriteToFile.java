package ru.otus.hw7_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Класс записывает полученное число в файл
 */
public class WriteToFile {

    /**
     * Метод принимает число и либо записывает его в файл, либо выбрасывает исключение
     * @param number - получаемое число
     * @throws FileNotFoundException - исключение
     */
    public static void recordToFile(long number) throws FileNotFoundException {
        boolean random = new Random().nextBoolean();
        System.out.println("Start recording");

        if (random) {
            try (FileWriter writer = new FileWriter(File.separator + "home" + File.separator + "nokss" + File.separator +
                    "IdeaProjects" + File.separator + "OTUS" + File.separator + "HomeWork7" + File.separator + "file.txt")) {
                String temp = Long.toString(number);
                writer.write(temp);

                System.out.println("File written successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //System.out.println("File not written!");
            throw new FileNotFoundException("File not found");
        }
    }
}
