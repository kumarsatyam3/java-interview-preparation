import java.util.*;
import java.util.stream.Collectors;
public class StreamOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 4, 7, 2, 1, 6, 5);
        List<Integer> sortedOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Odd Numbers: " + sortedOdds); 
    }
}