import java.util.Arrays;
import java.util.List;

class Employee{
    String name;
    String department;
    double salary;

    Employee(String name,String department,double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }
}




public class StreamFindDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Satyam", "IT", 95000),
            new Employee("Amit", "HR", 60000),
            new Employee("Rohit", "IT", 85000),
            new Employee("Rahul", "Finance", 75000)
        );

        double avgSalary = employees.stream()
                            .filter(emp -> "IT".equalsIgnoreCase(emp.getDepartment()))
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .orElse(0.0);

         System.out.println("Average Salary of IT Dept: " + avgSalary);
    }
}
