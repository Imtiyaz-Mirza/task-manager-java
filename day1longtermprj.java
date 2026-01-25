import java.util.ArrayList;

public class day1longtermprj {
    static void addTask(String tasks) {
        System.out.println("Task added : " + tasks);
    }

    public static void main(String args[]) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Learn Java !");
        tasks.add("Write code and understand it !");
        tasks.add("Implement in projects !");
        System.out.println("Smart Task Manager");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + tasks.get(i));
        }
        tasks.remove(0);
        tasks.set(1, "Implement in projects and submit it on github !");
        System.out.println("\n Updated Tasks !");
        for (String every : tasks) {
            System.out.println(every);
        }
    }
}
