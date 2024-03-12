package org.example;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println(dividing(6,0));
    }

    /**
     * Метод выполянет деление int переменных
     * @param a делимое число
     * @param b делитель
     * @return возвращаем результат деления
     * @throw ArithmeticException ловим и обрабатываем если b == 0
     */
    public static int dividing(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException e) {
            System.err.println("Делить на ноль нельзя!");
            return 0;
        } finally {
            System.out.println("Операция деления завершена");
        }
    }
}
