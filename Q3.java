
import java.util.*;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(id + " " + title + " " + author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book b = (Book) obj;
        return this.id == b.id;
    }
}

public class Q10_03 {
    public static void main(String[] args) {

        HashSet<Book> books = new HashSet<>();

        books.add(new Book(1, "Java", "James"));
        books.add(new Book(2, "Python", "Guido"));
        books.add(new Book(1, "Java", "James"));

        System.out.println("Book Details:");

        for (Book b : books) {
            b.display();
        }

        System.out.println("Total Books: " + books.size());
    }
}
