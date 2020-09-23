package dao;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class Sql2oEndangeredAnimalDaoTest {
    private static Sql2oEndangeredAnimalDao endangeredAnimalDao;
    private static Connection conn;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/wildlife_tracker_test";//connect to postgres test db
        Sql2o sql2o = new Sql2o(connectionString, null, null);

        endangeredAnimalDao = new Sql2oEndangeredAnimalDao(sql2o);
        conn = sql2o.open();
    }


    @AfterClass // changed to @AfterClass (run once after all tests in this file completed)
    public static void shutDown() throws Exception { //changed to static and shutDown
        conn.close(); // close connection once after this entire test file is finished
        System.out.println("connection closed");

    }

}