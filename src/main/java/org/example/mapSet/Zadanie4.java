package org.example.mapSet;

import lombok.extern.java.Log;

import java.util.HashSet;
@Log
public class Zadanie4 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(10);

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(9);
        hashSet1.add(10);
        hashSet1.add(11);
        hashSet1.add(12);
        hashSet1.add(13);
        hashSet1.add(14);
        hashSet1.add(15);

        HashSet<Integer> result = new HashSet<>(hashSet);
        result.retainAll(hashSet1);
        log.info("Пересечение множеств: " + result);
        HashSet<Integer> result1 = new HashSet<>(hashSet);
        result1.addAll(hashSet1);
        log.info("Объеденение множеств: " + result1);
        HashSet<Integer> result2 = new HashSet<>(hashSet);
        result2.removeAll(hashSet1);
        log.info("Разность: " + result2);
    }
}
