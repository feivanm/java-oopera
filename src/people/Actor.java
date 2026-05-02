package people;

import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surName, int height, Gender gender) {
        super(name, surName, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        return Objects.equals(actor.name, this.name) &&
                Objects.equals(actor.surName, this.surName) &&
                Objects.equals(actor.height, this.height) &&
                Objects.equals(actor.gender, this.gender);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + (surName != null ? surName.hashCode() : 0);
        hash = 31 * hash + (gender != null ? gender.hashCode() : 0);
        hash = 31 * hash + height;
        return hash;
    }

}
