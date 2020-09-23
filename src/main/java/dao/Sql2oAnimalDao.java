package dao;

import models.Animal;
import org.sql2o.*;
import java.util.List;

public class Sql2oAnimalDao implements animalSighting {
//    private static Sql2oAnimalDao animalDao;
//    private static Connection conn;
    private final Sql2o sql2o;

    public Sql2oAnimalDao(Sql2o sql2o) {
        this.sql2o=sql2o;
    }

    @Override
    public void add(Animal animal) {
        String sql = "INSERT INTO animals (name,rangerName) VALUES (:name,:rangerName);";
        try(Connection con = sql2o.open()){ //try to open a connection
            int id = (int) con.createQuery(sql, true) //make a new variable
                    .addParameter("name",animal.getName())
                    .addParameter("rangerName",animal.getRangerName())
                    .executeUpdate() //run it all
                    .getKey(); //int id is now the row number (row “key”) of db
            animal.setId(id); //update object to set id now from database
        } catch (Sql2oException ex) {
            System.out.println(ex); //oops we have an error!
        }
    }

//    @Override
    public List<Animal> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM animals")
                    .executeAndFetch(Animal.class); //fetch a list
        }
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllSightings() {

    }

    @Override
    public void update(int id, String newName, String newRangerName) {
        String sql = "UPDATE animals SET (id, name, rangerName) = (:id, :name, :rangerName) WHERE id=:id";   //raw sql
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("name", newName)
                    .addParameter("categoryId", newRangerName)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }
}
