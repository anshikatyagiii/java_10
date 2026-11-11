
import java.util.*;

class Task {

    int taskId;
    String description;

    Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    void display() {
        System.out.println(taskId + " " + description);
    }
}

public class Q10_08 {

    Stack<Task> tasks = new Stack<>();

    void pushTask(Task t) {
        tasks.push(t);
    }

    void popTask() {
        if (!tasks.empty()) {
            Task t = tasks.pop();
            System.out.println("Completed Task: " + t.description);
        }
    }

    void displayTasks() {
        for (Task t : tasks) {
            t.display();
        }
    }

    public static void main(String[] args) {

        Q10_08 obj = new Q10_08();

        obj.pushTask(new Task(1, "Study Java"));
        obj.pushTask(new Task(2, "Complete Assignment"));
        obj.pushTask(new Task(3, "Practice Coding"));

        System.out.println("All Tasks:");
        obj.displayTasks();

        obj.popTask();

        System.out.println("Remaining Tasks:");
        obj.displayTasks();
    }
}
