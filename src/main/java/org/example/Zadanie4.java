package org.example;

import java.io.*;

public class Zadanie4 {
    public static void main(String[] args) {
        File file = new File("source.txt");

        String text = "Привет Максима";

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
        } catch (IOException e) {
            System.err.println("Ошибка записи файла");
        }
        copyFileConten("source.txt", "target.txt");
    }

    /**
     * метод для чтения и записи в файл
     *
     * @param sourcePath путь к исходному файлу
     * @param targetPath путь к целевомц файлу
     * @throw FileNotFoundException ловим и обрабатываем, если файл не найден
     * @throw IOException ловим и обрабатываем, если произошла ошибка ввода
     */
    public static void copyFileConten(String sourcePath, String targetPath) {
        try (FileReader fileReader = new FileReader(sourcePath);
             FileWriter fileWriter = new FileWriter(targetPath)) {
            if (!new File(targetPath).exists()) {
                File file2 = new File(targetPath);
            }

            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Произошла ошибка ввода");
        }
    }
}
