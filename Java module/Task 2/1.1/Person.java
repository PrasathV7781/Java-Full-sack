public class Person {
    private String name;
    private int age;

    // Constructor with default age
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    // Constructor with specified age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Default age
        Person person1 = new Person("Alice");
        person1.display();  // Output: Name: Alice, Age: 18

        // Custom age
        Person person2 = new Person("Bob", 25);
        person2.display();  // Output: Name: Bob, Age: 25
    }
}
