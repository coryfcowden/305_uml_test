package org.example;

public class Manager extends Employee { // Inheritance
    private Team team; // Composition

    public Manager(String name, Address address, Company employer) {
        super(name, address, employer);
        this.team = new Team();
    }

    class Team { // Inner class = composition
        // team belongs only to the manager
    }
}
