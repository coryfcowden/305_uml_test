package model;

import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees; // Aggregation (company has employees)

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
