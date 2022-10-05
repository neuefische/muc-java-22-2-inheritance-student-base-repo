package de.neuefische;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello! My name is " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
