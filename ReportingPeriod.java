import java.util.Scanner;
public class ReportingPeriod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Please set the reporting period in seconds:\n");

      
        int reportingPeriod = getUserInput();

        System.out.println("Reporting period set to " + reportingPeriod + " seconds.");

      
        while (true) {
            try {
               
                Thread.sleep(reportingPeriod * 1000);

               
                System.out.println("Reporting! It's been " + reportingPeriod + " seconds.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int getUserInput() {
        int userInput = -1;
        Scanner scanner = new Scanner(System.in);

       
        while (userInput <= 0) {
            try {
                System.out.print("Enter a positive integer for reporting period: ");
                userInput = scanner.nextInt();

                if (userInput <= 0) {
                    System.out.println("Please enter a positive integer for reporting period.");
                }
            } catch (java.util.InputMismatchException e) {
                
                System.out.println("Invalid input. Please enter a positive integer for reporting period.");
                scanner.next();
            }
        }

        return userInput;
    }
    
}
