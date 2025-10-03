package assignment.task4;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Make a list of Student
        List<Student> students = List.of(
                new Student("Alle", 70),
                new Student("Nolle", 90),
                new Student("Jolle", 80),
                new Student("Solle", 100),
                new Student("Volle", 60)
        );

        // Filter students with Predicate (keeping type)
        List<String> studentNamesWithHighGrades = mapList(
                students.stream()
                        .filter(student -> student.getGrade() > 70)
                        .toList(),
                Student::getName
        );
        System.out.println("Students with grades higher than 70:");
        studentNamesWithHighGrades.forEach(System.out::println);

        // Sort students with Comparator
        List<String> sortedStudentNamesByGrade = mapList(
                students.stream()
                        .sorted(Comparator.comparing(Student::getGrade))
                        .toList()
                        .reversed(),
                Student::getName
        );
        System.out.println("Sorted students by grade (highest grade first):");
        sortedStudentNamesByGrade.forEach(System.out::println);

        // Convert original list into a String list with following format:
        List<String> studentStringList = mapList(
                students.stream()
                        .toList(),
                (s -> String.format("Name: %s, Grade: %d", s.getName(), s.getGrade()))
        );
        System.out.println("Specific String format on original list:");
        studentStringList.forEach(System.out::println);

        // Extra - filter students but keep Student type
        List<Student> studentsWithUltraHighGrades = mapList(
                students.stream()
                        .filter(student -> student.getGrade() > 85)
                        .toList(),
                Function.identity()
        );
    }

    public static <T, R> List<R> mapList(List<T> list, Function<T, R> mapper) {
        List<R> mapped = list.stream().map(mapper).toList();
        return mapped;
    }
}
