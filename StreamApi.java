import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mufaddal", "Shahid", "Rizwan", "Bilal", "Ammar", "Hamza");
        List<String> namesStartingWithM = new ArrayList<>();

        // Imperative Approach - Before Streams
        for (String person : names) {
            if (person.startsWith("M")) {
                namesStartingWithM.add(person);
            }
        }
        System.out.println(namesStartingWithM);

        // Declarative Approach - After Streams
        namesStartingWithM = names.stream().filter(person -> person.startsWith("M")).collect(Collectors.toList());
        System.out.println(namesStartingWithM);

    }

}
