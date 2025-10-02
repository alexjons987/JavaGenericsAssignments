package assignment.three;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("1984", "George Orwell", 1949),
                new Book("The Great Gatsby", " F. Scott Fitzgerald", 1925),
                new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 1967),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("Odyssey", "Homeros", -700),
                new Book("Some Book", "Some Author", 2025),
                new Book("Some Other Book", "Some Other Author", 2024)
        );

        // 1. Sort by year.
        System.out.println("Books by year:");
        List<Book> booksByYear = sortList(books, Comparator.comparing(Book::getYear));
        booksByYear.forEach(System.out::println);

        // 2. Sort by authors.
        System.out.println("\nBooks by author:");
        List<Book> booksByAuthors = sortList(books, Comparator.comparing(Book::getAuthors));
        booksByAuthors.forEach(System.out::println);

        // 3. Sort by year then authors.
        System.out.println("\nBooks by year then author:");
        List<Book> booksByYearThenAuthors = sortList(
                books,
                Comparator.comparing(Book::getYear)
                        .thenComparing(Book::getAuthors)
        );
        booksByYearThenAuthors.forEach(System.out::println);
    }

    public static <T> List<T> sortList(List<T> list, Comparator<T> comparator) {
        return list.stream()
                .sorted(comparator)
                .toList();
    }
}
