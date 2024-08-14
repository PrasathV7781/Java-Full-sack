import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Given list of strings
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");

        // Filter out empty strings
        List<String> nonEmptyStrings = strings.stream()
                                              .filter(s -> !s.isEmpty())
                                              .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
    }
}

//Output: [abc, be, efg, abcd, jkl]
