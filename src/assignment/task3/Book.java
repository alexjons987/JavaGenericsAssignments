package assignment.task3;

public class Book {
    String title;
    String authors;
    int year;

    public Book(String title, String authors, int year) {
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("\"%s\" %d by %s", this.title, this.year, this.authors);
    }
}
