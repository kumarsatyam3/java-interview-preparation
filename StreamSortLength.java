import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortLength {
    public static void main(String[] args) {
        List<String> techs = Arrays.asList("Spring Boot", "Java", "AWS", "Microservices");

        List<String> sortedByLength = techs.stream()
                                        .sorted(Comparator.comparingInt(String::length))
                                        .collect(Collectors.toList());

        System.out.println("Sorted by length: " + sortedByLength);
    }
}
