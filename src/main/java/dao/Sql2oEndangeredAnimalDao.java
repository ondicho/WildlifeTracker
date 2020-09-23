package dao;

import models.Animal;
import models.EndangeredAnimal;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oEndangeredAnimalDao implements endangeredSighting {
    private final Sql2o sql2o;

    public Sql2oEndangeredAnimalDao(Sql2o sql2o) {
        this.sql2o=sql2o;
    }


    @Override
    public void add(EndangeredAnimal endangeredAnimal) {
        String sql = "INSERT INTO sightings (name,age,health,location,rangerName) VALUES (:name,:age, :health, :location, :rangerName);";
        try(Connection con = sql2o.open()){ //try to open a connection
            int id = (int) con.createQuery(sql, true) //make a new variable
                    .addParameter("name",endangeredAnimal.getName())
                    .addParameter("name",endangeredAnimal.getAge())
                    .addParameter("name",endangeredAnimal.getHealth())
                    .addParameter("name",endangeredAnimal.getLocation())
                    .addParameter("name",endangeredAnimal.getRangerName())
                    .executeUpdate() //run it all
                    .getKey(); //int id is now the row number (row “key”) of db
            endangeredAnimal.setId(id); //update object to set id now from database
        } catch (Sql2oException ex) {
            System.out.println(ex); //oops we have an error!
        }

    }




    public List<EndangeredAnimal> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM sightings")
                    .executeAndFetch(EndangeredAnimal.class); //fetch a list
        }
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllSightings() {

    }

    @Override
    public void update(int id, String name, String rangerName) {

    }
}
