package people;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surName, int height, Gender gender, int numberOfShows) {
        super(name, surName, height, gender);
        this.numberOfShows = numberOfShows;
    }

}
