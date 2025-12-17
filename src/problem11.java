import java.util.*;

public class problem11 {

    static class Task {
        int deadline, minutes;
        Task(int d, int m) {
            deadline = d;
            minutes = m;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++)
            tasks[i] = new Task(sc.nextInt(), sc.nextInt());

        Arrays.sort(tasks, Comparator.comparingInt(t -> t.deadline));

        int time = 0;
        int maxLateness = 0;

        for (Task t : tasks) {
            time += t.minutes;
            maxLateness = Math.max(maxLateness, time - t.deadline);
            System.out.println(maxLateness);
        }
    }
}
