package dao;

import models.Animal;

import java.util.List;


public interface Sighting {
    //add animal
    void add(Animal animal);

    //LIST
    List<Animal> getAll();

    //delete
    void deleteById(int id);
    void clearAllSightings();

}
