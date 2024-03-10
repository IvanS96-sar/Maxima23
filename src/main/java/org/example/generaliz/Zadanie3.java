package org.example.generaliz;

import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        swap(array, 0, 2);

        String[] arr = new String[]{"Хлеб", "Молоко", "Яйца", "Кечуп", "Майонез"};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);
    }

    public static <T> void swap(T[] arr, int index1, int index2) {
        T element = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = element;
        System.out.println(Arrays.toString(arr));
    }
}
