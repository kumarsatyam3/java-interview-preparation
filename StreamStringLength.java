import java.util.Arrays;
import java.util.List;
// find the string starts with s and count total length
public class StreamStringLength {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("satyam","kumar","shyam","suresh","raunak");

        int totalLength = names.stream().
                            filter(name->name.startsWith("s")||name.startsWith("S")).
                            mapToInt(String::length).
                            sum();

        System.out.println("Total length of names starting with S: " + totalLength);
    }
}
