package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Student matthias = new ComputerScienceStudent("Matthias");
        Student rebecca = new ComputerScienceStudent("Rebecca", "Java");

        System.out.println(matthias.sayHello());
        System.out.println(rebecca.sayHello());
    }
}