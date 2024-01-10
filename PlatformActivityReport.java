import java.util.Scanner;
public class PlatformActivityReport {
    private static int dailyClassesCreated = 5;
    private static int dailyStudentsEnrolled = 100;
    private static int dailyDutiesDelivered = 20;
    private static int dailyDiscussionBoardActivities = 30;

    private static int weeklyClassesCreated = 35;
    private static int weeklyStudentsEnrolled = 500;
    private static int weeklyDutiesDelivered = 150;
    private static int weeklyDiscussionBoardActivities = 200;

    private static int monthlyClassesCreated = 150;
    private static int monthlyStudentsEnrolled = 2000;
    private static int monthlyDutiesDelivered = 600;
    private static int monthlyDiscussionBoardActivities = 800;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Platform Activity Report Generator!\n");

       
        String reportingPeriod = getReportingPeriod();

       
        generateAndDisplayReport(reportingPeriod);
    }

    private static String getReportingPeriod() {
        Scanner scanner = new Scanner(System.in);
        String reportingPeriod = "";

        while (!reportingPeriod.equals("daily") && !reportingPeriod.equals("weekly") && !reportingPeriod.equals("monthly")) {
            System.out.print("Choose a reporting period (daily/weekly/monthly): ");
            reportingPeriod = scanner.nextLine().toLowerCase();

            if (!reportingPeriod.equals("daily") && !reportingPeriod.equals("weekly") && !reportingPeriod.equals("monthly")) {
                System.out.println("Invalid choice. Please choose a valid reporting period.");
            }
        }

        return reportingPeriod;
    }

    private static void generateAndDisplayReport(String reportingPeriod) {
        int classesCreated = 0, studentsEnrolled = 0, dutiesDelivered = 0, discussionBoardActivities = 0;

        switch (reportingPeriod) {
            case "daily":
                classesCreated = dailyClassesCreated;
                studentsEnrolled = dailyStudentsEnrolled;
                dutiesDelivered = dailyDutiesDelivered;
                discussionBoardActivities = dailyDiscussionBoardActivities;
                break;
            case "weekly":
                classesCreated = weeklyClassesCreated;
                studentsEnrolled = weeklyStudentsEnrolled;
                dutiesDelivered = weeklyDutiesDelivered;
                discussionBoardActivities = weeklyDiscussionBoardActivities;
                break;
            case "monthly":
                classesCreated = monthlyClassesCreated;
                studentsEnrolled = monthlyStudentsEnrolled;
                dutiesDelivered = monthlyDutiesDelivered;
                discussionBoardActivities = monthlyDiscussionBoardActivities;
                break;
        }

        System.out.println("\n  Platform Activity Report (" + reportingPeriod + ") \t");
        System.out.println("Number of classes created: " + classesCreated);
        System.out.println("Number of students enrolled: " + studentsEnrolled);
        System.out.println("Number of duties delivered: " + dutiesDelivered);
        System.out.println("Number of discussion board activities: " + discussionBoardActivities);
        System.out.println("\nThank you for using the Platform Activity Report Generator!!");
    }
    
}
