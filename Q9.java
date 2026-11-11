
import java.util.*;

class Patient {

    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Q10_09 {

    Queue<Patient> patients = new LinkedList<>();

    void addPatient(Patient p) {
        patients.add(p);
    }

    void servePatient() {
        if (!patients.isEmpty()) {
            Patient p = patients.poll();

            System.out.println("Serving Patient:");
            p.display();
        }
    }

    void displayPatients() {
        for (Patient p : patients) {
            p.display();
        }
    }

    public static void main(String[] args) {

        Q10_09 obj = new Q10_09();

        obj.addPatient(new Patient(1, "Anshika"));
        obj.addPatient(new Patient(2, "Rahul"));
        obj.addPatient(new Patient(3, "Priya"));

        System.out.println("Patient Queue:");
        obj.displayPatients();

        obj.servePatient();

        System.out.println("Remaining Patients:");
        obj.displayPatients();
    }
}
