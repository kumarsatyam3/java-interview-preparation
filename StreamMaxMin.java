import java.util.*;
public class StreamMaxMin {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 15, 1, 9, 25, 2);
        int max = nums.stream().max(Integer::compare).orElseThrow();
        int min = nums.stream().min(Integer::compare).orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
