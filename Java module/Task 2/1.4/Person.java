import java.util.Scanner;

// Base class Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Employee that inherits from Person
class Employee extends Person {
    private String employeeID;
    private double salary;

    // Constructor to initialize all attributes including those from Person
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);  // Call to Person's constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter methods for employeeID and salary
    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display Employee details
    @Override
    public void display() {
        super.display();  // Call to Person's display method
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs for Person attributes
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        // Read inputs for Employee attributes
        System.out.println("Enter employee ID:");
        String employeeID = scanner.nextLine();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();

        // Create an Employee object with the inputs
        Employee emp = new Employee(name, age, employeeID, salary);

        // Display Employee details
        emp.display();

        scanner.close();
    }
}
