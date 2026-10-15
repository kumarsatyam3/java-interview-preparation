import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoinString {
    public static void main(String[] args) {
        
        List<String> programmingLanguages = Arrays.asList("Java", "Spring Boot", "Microservices", "AWS");
        String result = programmingLanguages.stream()
                        .collect(Collectors.joining(",","[","]"));
        System.out.println(result);
    }
}
