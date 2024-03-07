package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        multiplyByTwo();
    }

    /**
     * метод который запрашивает ввод числа с консоли и умножает число на 2
     *
     * @throw InputMismatchException ловим и обрабатываем исключение если введено не число
     */
    public static void multiplyByTwo() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number ;
        while (true) {
            try {
                number = scanner.nextInt();
                number = number * 2;
                System.out.println("Результат: " + number);
                break;


            } catch (InputMismatchException e) {
                System.err.println("Ошибка! Введите корректное значение.");
                scanner.next();
            }
        }
        scanner.close();
    }
}

