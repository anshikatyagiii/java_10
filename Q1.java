
import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Q10_01 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Anshika"));
        list.add(new Student("Rahul"));
        list.add(new Student("Priya"));

        System.out.println("Student List:");

        for (Student s : list) {
            s.display();
        }

        list.remove(1);

        System.out.println("After Removing:");

        for (Student s : list) {
            s.display();
        }
    }
}
