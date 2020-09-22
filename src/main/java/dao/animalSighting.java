package dao;

import models.Animal;

import java.util.List;


public interface animalSighting {
    //add animal
    void add(Animal animal);

    //LIST
    List<Animal> getAll();

    //delete
    void deleteById(int id);
    void clearAllSightings();

    //update
    void update(int id, String name, String rangerName);


}
