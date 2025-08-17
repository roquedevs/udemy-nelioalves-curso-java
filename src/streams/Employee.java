package streams;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final String email;
    private final BigDecimal salary;

    public Employee(String name, String email, BigDecimal salary) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be null or empty");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Employee email cannot be null or empty");
        }
        if (salary == null || salary.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Employee salary cannot be negative");
        }
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
