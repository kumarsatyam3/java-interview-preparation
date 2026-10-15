import java.util.Arrays;
import java.util.List;

public class StreamAverageLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Boot", "AWS", "Microservices");
        double averageLength = words.stream()
                                .mapToDouble(String::length)
                                .average()
                                .orElse(0.0);
         System.out.println("Average length of strings: " + averageLength);
    }
}
