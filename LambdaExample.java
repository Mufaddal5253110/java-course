
import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {

        List<String> namesOne = Arrays.asList("Mufaddal", "Shahid", "Rizwan", "Bilal", "Ammar", "Hamza");
        List<String> namesTwo = Arrays.asList("Mufaddal", "Shahid", "Rizwan", "Bilal", "Ammar", "Hamza");

        // Without Lambda Expression - Imperative Approach
        namesOne.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(namesOne);

        // With Lambda Expression - Declarative Approach
        namesTwo.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(namesTwo);
    }
}
