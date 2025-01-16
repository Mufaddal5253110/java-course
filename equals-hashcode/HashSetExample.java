import java.util.HashSet;
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

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(1, "Mufaddal"));
        employees.add(new Employee(2, "Ali"));
        employees.add(new Employee(1, "Mufaddal")); // Duplicate ID, not added

        //print all employees
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

/*
 * HashSet uses hashCode() to place objects into "buckets".
 * It then uses equals() to check for duplicates in the same bucket.
 * Since two employees with the same ID are considered equal (equals() returns true), the duplicate is not added.
 * 
 */