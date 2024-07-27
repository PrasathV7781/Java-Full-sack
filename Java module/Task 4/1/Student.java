import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21). Age provided: " + age);
    
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters. It should not contain numbers or special symbols. Name provided: " + name);
        
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            Student student = new Student(rollNo, name, age, course);
            System.out.println("Student created successfully");
            System.out.println("Roll No: " + student.rollNo);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Course: " + student.course);

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
