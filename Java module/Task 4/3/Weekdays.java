import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        // Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for the day position
            System.out.print("Enter the day position (0-6): ");
            int dayPosition = scanner.nextInt();

            // Print the corresponding day name
            System.out.println("Day: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("Invalid day position. Please enter a value between 0 and 6."+e);
        }  finally {
            // Close the scanner
            scanner.close();
        }
    }
}
