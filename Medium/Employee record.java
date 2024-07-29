import java.util.HashMap;
import java.util.Map;
class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee("Alice", 1));
        employeeMap.put(2, new Employee("Bob", 2));
        System.out.println("Is map empty? " + employeeMap.isEmpty());
        employeeMap.remove(1);
        System.out.println("After removal: " + employeeMap);
        employeeMap.clear();
        System.out.println("Is map empty after clear? " + employeeMap.isEmpty());
    }
}
