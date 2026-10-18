import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    int id; 
    String name;
    
    Emp(int id, String name) { 
        this.id = id; 
        this.name = name; 
    }
    public int getId() { return id; }
    public String getName() { return name; }
}

public class StreamConvertToMap {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
            new Emp(101, "Satyam"), 
            new Emp(102, "Amit")
        );

        
        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Emp::getId, Emp::getName));

        System.out.println("Mapped Data: " + map); 
        
    }
}

