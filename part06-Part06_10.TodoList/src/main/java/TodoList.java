
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (!task.equals("") && !tasks.contains(task)) {
            tasks.add(task);
        }
    }

    public void print() {
        for (String task : tasks) {
            System.out.println((tasks.indexOf(task) + 1) + ": " + task);
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
