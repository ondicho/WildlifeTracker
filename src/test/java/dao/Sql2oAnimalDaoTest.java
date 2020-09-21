package dao;

import models.Animal;
import org.junit.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class Sql2oAnimalDaoTest {
    private static Sql2oAnimalDao animalDao;
    private static Connection conn;

    @BeforeClass
    public void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/wildlife_tracker_test";//connect to postgres test db
        Sql2o sql2o=new Sql2o(connectionString,null,null);

        animalDao=new Sql2oAnimalDao(sql2o);
        conn=sql2o.open();//open connection once before test file is run
    }

   @After//run after every test
    public void tearDown() throws Exception{
        System.out.println("clearing Database");
        animalDao.clearAllSightings();//clear all sightings
    }
    @AfterClass // changed to @AfterClass (run once after all tests in this file completed)
    public static void shutDown() throws Exception { //changed to static and shutDown
        conn.close(); // close connection once after this entire test file is finished
        System.out.println("connection closed");
    }

    @Test
    public void addingAnimalSetsId() throws Exception {
        Animal animal=addNewSighting();
        int originalAnimalId=animal.getId();
        animalDao.add(animal);
        assertNotEquals(originalAnimalId, animal.getId());

    }
    public Animal addNewSighting(){
        return new Animal("zebra");
    }
}