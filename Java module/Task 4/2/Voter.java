import java.util.Scanner;

class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            Voter voter = new Voter(voterId, name, age);
            System.out.println("Voter created successfully");
            System.out.println("Voter ID: " + voter.getVoterId());
            System.out.println("Name: " + voter.getName());
            System.out.println("Age: " + voter.getAge());

        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
