import java.util.Scanner;

public class TaskSubmission {
    public static void main(String[] args) {
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        boolean taskSubmitted = false;

        Scanner scanner = new Scanner(System.in);

        while (attempts < MAX_ATTEMPTS && !taskSubmitted) {
            System.out.print("Enter your task: ");
            String task = scanner.nextLine();

            if (task.equals("submit")) {
                System.out.println("Task submitted successfully!");
                taskSubmitted = true;
            } else {
                attempts++;
                System.out.println("Invalid task. Please try again. Remaining attempts: " + (MAX_ATTEMPTS - attempts));
            }
        }

        if (attempts == MAX_ATTEMPTS && !taskSubmitted) {
            System.out.println("Maximum number of attempts reached. Task submission failed.");
        }

        scanner.close();
    }
}
