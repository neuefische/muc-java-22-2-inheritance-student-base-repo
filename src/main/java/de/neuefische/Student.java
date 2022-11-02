package de.neuefische;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Privet! Hallo Leute! Hi there!";
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
