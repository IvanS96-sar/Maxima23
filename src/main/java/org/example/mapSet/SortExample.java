package org.example.mapSet;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
@Log
public class SortExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Сергей",55000));
        employees.add(new Employee("Аркадий",70000));
        employees.add(new Employee("Ян",95000));
        employees.add(new Employee("Констанит",105000));
        Collections.sort(employees);
        log.info("Отсортированный вариант: " + employees);

        log.info("Используем TreeSet");
        TreeSet<Employee> employeeTreeSet = new TreeSet<>();
        employeeTreeSet.add(new Employee("Сергей",55000));
        employeeTreeSet.add(new Employee("Аркадий",70000));
        employeeTreeSet.add(new Employee("Ян",95000));
        employeeTreeSet.add(new Employee("Констанит",105000));
        log.info("Без использования Comparator" + employeeTreeSet);

        TreeSet<Employee> employeeTreeSet1 = new TreeSet<>(new EmployeeSalaryComparator());
        employeeTreeSet1.add(new Employee("Сергей",55000));
        employeeTreeSet1.add(new Employee("Аркадий",70000));
        employeeTreeSet1.add(new Employee("Ян",95000));
        employeeTreeSet1.add(new Employee("Констанит",105000));
        log.info("С использованием Comparator: " + employeeTreeSet1);
    }
}
