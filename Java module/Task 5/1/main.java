import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Use map() to convert each string to uppercase
        List<String> upperCaseNames = names.map(String::toUpperCase)
                                           .collect(Collectors.toList());

        // Print the result
        upperCaseNames.forEach(System.out::println);
    }
}


//Output:
/*"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=61759:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\PRASATH\IdeaProjectsTask\Task 5\out\production\Task 5" Main
ABCDEF
Process finished with exit code 0 ***/

