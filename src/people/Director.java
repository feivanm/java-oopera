package people;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surName, Gender gender, int numberOfShows) {
        super(name, surName,  gender);
        this.numberOfShows = numberOfShows;
    }

}
