import java.util.HashMap;
import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id; // Compare based on ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Generate hash based on ID
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        // Add employees to the map with unique IDs as keys
        employeeMap.put(1, new Employee(1, "Mufaddal"));
        employeeMap.put(2, new Employee(2, "Ali"));
        employeeMap.put(3, new Employee(3, "Alice"));

        Employee emp = employeeMap.get(1);
        System.out.println("Employee with ID 1: " + emp);

        // Replace the employee with same ID
        employeeMap.put(2, new Employee(2, "Bob"));

        for(Employee employee : employeeMap.values()) {
            System.out.println(employee);
        }

    }
}

/*
 * HashMap uses hashCode() of the key (ID) to locate the bucket.
 * If multiple keys map to the same hash code (collision), equals() checks which key matches.
 * The new employee with ID 102 replaces the old entry since the keys are considered equal.
 * 
 */