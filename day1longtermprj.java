import java.util.ArrayList;
import java.util.Scanner;

public class day1longtermprj {
    static ArrayList<String> tasks = new ArrayList<>();

    static void addTask(Scanner userInput) {
        System.out.print("Enter the task name : ");
        String task = userInput.nextLine();
        tasks.add(task);
        System.out.println("Task added Successfully !");
    }

    static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found !");
            return;
        }
        System.out.println("Your Tasks : ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));

        }
    }

    static void deleteTask(Scanner userInput) {
        showTasks();
        if (tasks.isEmpty()) {
            return;
        }
        System.out.print("Enter the Task number to delete : ");
        int taskNum = userInput.nextInt();
        userInput.nextLine();
        int index = taskNum - 1;
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Deleted task : " + removedTask);
        } else {
            System.out.println("Invalid task name !");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Smart Task Manager ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    deleteTask(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using Smart Task Manager 🙌");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }
}
