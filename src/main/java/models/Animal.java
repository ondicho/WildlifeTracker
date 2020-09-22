package models;

import java.util.Objects;

public class Animal {
    private int id;
    private String name;
    private String rangerName;



    public Animal(String name,String rangerName) {
       this.name=name;
       this.rangerName=rangerName;
    }

    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }

    public String getRangerName() {
        return rangerName;
    }

    public void setRangerName(String rangerName) {
        this.rangerName = rangerName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                Objects.equals(name, animal.name) &&
                Objects.equals(rangerName, animal.rangerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rangerName);
    }
}

