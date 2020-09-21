package models;

import java.util.Objects;

public class Animal {
    private int id;
    private String name;



    public Animal(String name,int id){
       this.name=name;
       this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
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
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (id != animal.id) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return  Objects.hash(name);
    }
}

