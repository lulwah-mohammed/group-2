import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private boolean isPresent;

    public Student(String name) {
        this.name = name;
        this.isPresent = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void markPresent() {
        isPresent = true;
    }
}

public class OnlineLearningAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int count=0;
        System.out.println("Welcome to attendance system!");

        while (true) {
            System.out.print("Enter student name (or 'exit' to quit): ");
            String studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                break;
            }

            Student student = new Student(studentName);
            students.add(student);
        }

        System.out.println("\nMark attendance:");
        for (Student student : students) {
            System.out.println("Is " + student.getName() + " present? (yes/no): ");
            String presentStatus = scanner.next();

            if (presentStatus.equalsIgnoreCase("yes")) {
                student.markPresent();
                System.out.println();
                count++;
            }
        }

        System.out.println("\nAttendance Report:");
        for (Student student : students) {
            String presenceStatus = student.isPresent() ? "Present" : "Absent";
            System.out.println(student.getName() + ": " + presenceStatus);
        }
        System.out.print("Total of student that are attendance : "+count);
    }
}
