import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate the username
        String usernamePattern = "^[a-zA-Z0-9_,.]+$";
        System.out.println("Enter a username (English letters, numbers, _, .):");
        String username = scanner.nextLine();

        if (Pattern.matches(usernamePattern, username)) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is invalid.");
            return;
        }

        // Validate the password
        String passwordPattern = "^(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[@!]).{8,}$";
        System.out.println("Enter a password (at least 8 characters, combination of upper/lower case, numbers, @, and !):");
        String password = scanner.nextLine();

        if (Pattern.matches(passwordPattern, password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }
}
