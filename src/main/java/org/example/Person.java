package org.example;

public class Person {
    private String name;
    private Address address; // Association

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void contact(Phone phone) { // Dependency
        phone.call();
    }
}
