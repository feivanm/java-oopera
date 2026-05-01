package people;

import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getSurnameAndName(){
        return surName+" "+name;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Actor actor = (Actor) obj;
        return Objects.equals(actor.getName(), this.getName()) &&
                Objects.equals(actor.getSurName(), this.getSurName()) &&
                Objects.equals(actor.getHeight(), this.getHeight()) &&
                Objects.equals(actor.getGender(), this.getGender());
    }
}
