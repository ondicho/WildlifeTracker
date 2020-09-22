package dao;

import models.EndangeredAnimal;

import java.util.List;


public interface endangeredSighting {
    //add animal
    void add(EndangeredAnimal endangeredAnimal);

    //LIST
    List<EndangeredAnimal> getAll();

    //delete
    void deleteById(int id);
    void clearAllSightings();

    //update
    void update(int id, String name, String rangerName);


}
