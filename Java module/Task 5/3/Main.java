import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // List of student names
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Andrew");
        students.add("David");
        students.add("Anna");
        students.add("Mark");
        students.add("Alex");
        students.add("George");
        students.add("Albert");
        students.add("John");

        // Filter students whose names start with "A"
        List<String> specialGiftStudents = students.stream()
                                                   .filter(name -> name.startsWith("A"))
                                                   .collect(Collectors.toList());

        // Print the list of students who will receive special gifts
        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}


//Output: Students receiving special gifts: [Alice, Andrew, Anna, Alex, Albert]
