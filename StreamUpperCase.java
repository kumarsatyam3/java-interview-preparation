import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUpperCase {
  
    public static void main(String[] args) {
        List<String> names = Arrays.asList("satyam","kumar","shyam","suraj","");

        List<String> result = names.stream().
                                filter(name->!name.isEmpty()).
                                map(String::toUpperCase).
                                collect(Collectors.toList());

        System.out.println(result);
    }
}
