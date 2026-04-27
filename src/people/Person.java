package people;

public class Person {
    private String name;
    private String surName;
    private int height;
    private Gender gender;

    public Person(String name, String surName, int height, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.height = height;
        this.gender = gender;
    }
}
