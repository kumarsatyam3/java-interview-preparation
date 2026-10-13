import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFindDuplicate {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);

        Set<Integer> items = new HashSet<>();

        Set<Integer> duplicates = numbers.stream()
                                    .filter(n -> !items.add(n))
                                    .collect(Collectors.toSet());
                                
        System.out.println("Duplicate elements: " + duplicates);
    }
}
