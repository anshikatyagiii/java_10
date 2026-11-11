
import java.util.*;

class Department {

    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    public int hashCode() {
        return Objects.hash(deptName);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Department)) return false;

        Department d = (Department) obj;
        return Objects.equals(deptName, d.deptName);
    }
}

class Teacher extends Department {

    String teacherName;

    Teacher(String deptName, String teacherName) {
        super(deptName);
        this.teacherName = teacherName;
    }

    void display() {
        System.out.println(teacherName);
    }
}

public class Q10_10 {

    ArrayList<Department> departments = new ArrayList<>();

    HashMap<Department, List<Teacher>> map =
            new HashMap<>();

    void addTeacher(Department d, Teacher t) {

        if (!departments.contains(d)) {
            departments.add(d);
        }

        map.putIfAbsent(d, new ArrayList<>());

        map.get(d).add(t);
    }

    void displayTeachers() {

        for (Department d : departments) {

            System.out.println("Department: " + d.deptName);

            for (Teacher t : map.get(d)) {
                t.display();
            }
        }
    }

    public static void main(String[] args) {

        Q10_10 obj = new Q10_10();

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Management");

        obj.addTeacher(d1,
                new Teacher("Computer Science", "Anshika"));

        obj.addTeacher(d1,
                new Teacher("Computer Science", "Rahul"));

        obj.addTeacher(d2,
                new Teacher("Management", "Priya"));

        obj.displayTeachers();
    }
}
