import java.util.Arrays;
import java.util.List;

public class StreamFirstElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(45, 12, 89, 34);

        
        nums.stream()
            .findFirst()
            .ifPresent(System.out::println); 
        
    }
}
