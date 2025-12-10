package org.example;

public class Employee extends Person { // Inheritance
    private Company employer; // Association
    private static Employee instance;

    public Employee(String name, Address address, Company employer) {
        super(name, address);
        this.employer = employer;
    }
}
