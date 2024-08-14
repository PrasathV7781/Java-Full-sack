import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the input to a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age using Period
        Period age = Period.between(birthdate, currentDate);

        // Display the age in years, months, and days
        System.out.println("Your age is: " + age.getYears() + " years, " + 
                            age.getMonths() + " months, and " + 
                            age.getDays() + " days.");

        // Close the scanner
        scanner.close();
    }
}

/* Output: Enter your birthdate (yyyy-mm-dd): 1990-05-15
           Your age is: 34 years, 2 months, and 30 days.  **/
