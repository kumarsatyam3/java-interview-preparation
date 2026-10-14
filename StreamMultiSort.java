import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Staff {
    String name;
    double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String toString() { return name + ":" + salary; }
}

public class StreamMultiSort {
    public static void main(String[] args) {
          List<Staff> staffList = Arrays.asList(
            new Staff("Rahul", 85000),
            new Staff("Satyam", 95000),
            new Staff("Amit", 85000) // अमित और राहुल की सैलरी बराबर है
        );

        List<Staff> doubleSorted = staffList.stream()
                                    .sorted(Comparator.comparingDouble(Staff::getSalary).reversed()
                                    .thenComparing(Staff::getName))
                                    .collect(Collectors.toList());

        System.out.println("Double sorted List :" + doubleSorted);
    }
}
