package assignment.task2;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Alexander", 10000, "A"),
                new Employee("James", 20000, "B"),
                new Employee("Natdanai", 30000, "B"),
                new Employee("Sebastian", 40000, "C"),
                new Employee("Valentin", 50000, "C")
        );

        // 1. Increase salaries by 10%.
        forEachApply(employeeList, employee -> employee.setSalary((int) (employee.getSalary() * 1.10)));

        // 2. Print information about all employees.
        forEachApply(employeeList, System.out::println);
    }

    public static <T> void forEachApply(List<T> list, Consumer<T> action) {
        for (T l : list) {
            action.accept(l);
        }
    }
}
