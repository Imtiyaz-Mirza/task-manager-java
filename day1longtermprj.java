import java.util.ArrayList;
import java.util.Scanner;

public class day1longtermprj {
    static ArrayList<Task> tasks = new ArrayList<>();

    static void addTask(Scanner userInput) {
        System.out.print("Enter the task name : ");
        String taskTitle = userInput.nextLine();
        tasks.add(new Task(taskTitle));
        System.out.println("Task added Successfully !");
    }

    static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found !");
            return;
        }
        System.out.println("Your Tasks : ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getTitle());

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
            Task removedTask = tasks.remove(index);
            System.out.println("Deleted task : " + removedTask.getTitle());
        } else {
            System.out.println("Invalid task name !");
        }
    }

    static void editTask(Scanner userInput) {
        showTasks();
        if (tasks.isEmpty()) {
            return;
        }
        System.out.print("Enter number to edit task : ");
        int userWrite = userInput.nextInt();
        userInput.nextLine();
        int index = userWrite - 1;
        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new task name : ");
            String newTask = userInput.nextLine();
            tasks.get(index).setTitle(newTask);
            System.out.println("Your task has been successfully updated !");
        } else {
            System.out.println("Invalid task number !");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Smart Task Manager ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Edit task ");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
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
                    editTask(sc);
                    break;
                case 4:
                    deleteTask(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using Smart Task Manager 🙌");
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }
}
