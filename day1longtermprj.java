import java.util.ArrayList;
import java.util.Scanner;

public class day1longtermprj {
    static ArrayList<String> tasks = new ArrayList<>();

    static void addTask(String tasksName) {
        tasks.add(tasksName);
        System.out.println("Task added Successfully !");
    }

    static void showTasks() {
        System.out.println("Your Tasks : ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));

        }
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many tasks you want to add ? ");
        int count = userInput.nextInt();
        userInput.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter task " + i + ": ");
            String task = userInput.nextLine();
            addTask(task);
        }
        userInput.close();
        showTasks();
        System.out.println("Total tasks : " + tasks.size());

    }

}
