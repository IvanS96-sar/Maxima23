package org.example.mapSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Сергей",55000));
        employees.add(new Employee("Аркадий",70000));
        employees.add(new Employee("Ян",95000));
        employees.add(new Employee("Констанит",105000));
        Collections.sort(employees);
        System.out.println("Отсортированный вариант: " + employees);
        System.out.println("Используем TreeSet");
        TreeSet<Employee> employeeTreeSet = new TreeSet<>();
        employeeTreeSet.add(new Employee("Сергей",55000));
        employeeTreeSet.add(new Employee("Аркадий",70000));
        employeeTreeSet.add(new Employee("Ян",95000));
        employeeTreeSet.add(new Employee("Констанит",105000));
        System.out.println(employeeTreeSet);
        TreeSet<Employee> employeeTreeSet1 = new TreeSet<>(new EmployeeSalaryComparator());
        employeeTreeSet1.add(new Employee("Сергей",55000));
        employeeTreeSet1.add(new Employee("Аркадий",70000));
        employeeTreeSet1.add(new Employee("Ян",95000));
        employeeTreeSet1.add(new Employee("Констанит",105000));
        System.out.println(employeeTreeSet1);
    }
}
