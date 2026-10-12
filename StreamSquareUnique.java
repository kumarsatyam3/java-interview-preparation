import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSquareUnique {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,3);

        List<Integer> uniqueSquare = numbers.stream().
                                map(n->n*n).
                                distinct().
                                collect(Collectors.toList());

        System.out.println(uniqueSquare);
    }
}
