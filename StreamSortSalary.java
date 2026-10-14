import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SortEmployee {
    String name;
    double salary;

    SortEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() { return salary; }
    public String toString() { return name + ":" + salary; }
}

public class StreamSortSalary {
public static void main(String[] args) {
   List<SortEmployee> employees = Arrays.asList(
            new SortEmployee("Satyam", 95000),
            new SortEmployee("Amit", 60000),
            new SortEmployee("Rohit", 85000)
        ); 

    List<SortEmployee> sortedEmployees = employees.stream()
                                    .sorted(Comparator.comparingDouble(SortEmployee::getSalary).reversed())
                                    .collect(Collectors.toList());

    System.out.println("Sortted Employees (High to Low Salary) : "+ sortedEmployees);
}
    
}
