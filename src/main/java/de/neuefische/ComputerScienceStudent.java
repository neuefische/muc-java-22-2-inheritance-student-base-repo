package de.neuefische;

public class ComputerScienceStudent extends Student{

    private String favouriteProgrammingLanguage;

    public ComputerScienceStudent(String name, String favouriteProgrammingLanguage) {
        super(name);
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    public String getFavouriteProgrammingLanguage() {
        return favouriteProgrammingLanguage;
    }

    public void setFavouriteProgrammingLanguage(String favouriteProgrammingLanguage) {
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }
}
