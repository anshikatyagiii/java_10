
import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int id;

    Employee(int id, String name) {
        super(name);
        this.id = id;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Q10_02 {

    LinkedList<Employee> employees = new LinkedList<>();

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void displayEmployees() {
        for (Employee e : employees) {
            e.display();
        }
    }

    void searchEmployee(String name) {
        for (Employee e : employees) {
            if (e.name.equalsIgnoreCase(name)) {
                System.out.println("Employee Found:");
                e.display();
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    public static void main(String[] args) {

        Q10_02 obj = new Q10_02();

        obj.addEmployee(new Employee(1, "Rahul"));
        obj.addEmployee(new Employee(2, "Anshika"));

        System.out.println("Employees:");
        obj.displayEmployees();

        obj.searchEmployee("Anshika");
    }
}
