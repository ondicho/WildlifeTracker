package models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Animal {
    private int id;
    private String name;
    private String rangerName;
    private LocalDateTime createdAt;



    public Animal(String name,String rangerName) {
       this.name=name;
       this.rangerName=rangerName;
        this.createdAt = LocalDateTime.now();
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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

