package de.neuefische;

public abstract class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public abstract String sayHello();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
