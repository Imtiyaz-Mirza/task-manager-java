public class day1longtermprj {
    public static void main(String args[]) {
        String[] tasks = { "Learn Java basics !", "Understand loops !", "Practice arrays !" };
        System.out.println("Smart Task Manager");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < tasks.length; i++) {
            System.out.println("Task " + (i + 1) + ": " + tasks[i]);
        }
    }
}
