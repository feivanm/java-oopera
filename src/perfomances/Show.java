package perfomances;

import people.Actor;
import people.Director;

import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    protected Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<Actor>();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println("Режисер: " + getDirector().getSurnameAndName());
    }

    public void printActors() {
        System.out.println("Представление: "+ title);
        System.out.println("Список актеров: ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getSurnameAndName() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Такой актер уже существует в представлении");
        }
    }
    public boolean checkActorInShowBySurName (String searchedActor) {
        for (Actor actor : listOfActors) {
            if (Objects.equals(actor.getSurName(), searchedActor)) {
                return true;
            }
        }
        return false;
    }
    public void changeActor(Actor newActor, String surNameReplaced) {
        if(!checkActorInShowBySurName(surNameReplaced)){
            System.out.println("Актера с фамилией " + surNameReplaced + " нет в спектакле, попробуйте еще раз.");
            return;
        } else if (checkActorInShowBySurName(newActor.getSurName())) {
            System.out.println("Добавляемый актер "+ newActor.getSurnameAndName() +" уже участвует в шоу.");
            return;
        }
        for (Actor actor : listOfActors) {
            if (Objects.equals(actor.getSurName(), surNameReplaced)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
    }
}
