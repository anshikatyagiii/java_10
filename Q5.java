
import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll + " " + name);
    }
}

public class Q10_05 {

    HashMap<Integer, Student> students = new HashMap<>();

    void addStudent(Student s) {
        students.put(s.roll, s);
    }

    void removeStudent(int roll) {
        students.remove(roll);
    }

    void displayStudents() {
        for (Student s : students.values()) {
            s.display();
        }
    }

    public static void main(String[] args) {

        Q10_05 obj = new Q10_05();

        obj.addStudent(new Student(101, "Anshika"));
        obj.addStudent(new Student(102, "Rahul"));
        obj.addStudent(new Student(103, "Priya"));

        System.out.println("Students:");
        obj.displayStudents();

        obj.removeStudent(102);

        System.out.println("After Removing:");
        obj.displayStudents();
    }
}
