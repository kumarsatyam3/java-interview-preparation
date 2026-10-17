import java.util.*;
public class StreamCountChars {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Microservices", "AWS", "Satyam");
        long count = words.stream().filter(w -> w.length() > 5).count();
        System.out.println("Words with length > 5: " + count);
    }
}