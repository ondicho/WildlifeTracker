package models;

import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EndangeredAnimalTest {
    @Test
    public void NewEndangeredAnimalObjectGetsCorrectlyCreated_true() throws Exception {
        EndangeredAnimal endangeredAnimal = new EndangeredAnimal("dikdik","22","ill","samburu","Sakuda");
        assertEquals(true, endangeredAnimal instanceof EndangeredAnimal);
    }

    @Test
    public void getName(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        assertEquals("lion",setUpNewEndangeredAnimal.getName());
    }

    @Test
    public void getRangerName(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        assertEquals("sakuda",setUpNewEndangeredAnimal.getRangerName());
    }

    @Test
    public void getAge(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        assertEquals("22",setUpNewEndangeredAnimal.getAge());
    }

    @Test
    public void getHealth(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        assertEquals("ill",setUpNewEndangeredAnimal.getHealth());
    }

    @Test
    public void getLocation(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        assertEquals("samburu",setUpNewEndangeredAnimal.getLocation());
    }


    @Test
    public void setName(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        setUpNewEndangeredAnimal.setName("zebra");
        assertNotEquals("lion",setUpNewEndangeredAnimal.getName());
    }

    public void setAge(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        setUpNewEndangeredAnimal.setAge("25");
        assertNotEquals("22",setUpNewEndangeredAnimal.getAge());
    }

    public void setHealth(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        setUpNewEndangeredAnimal.setHealth("okay");
        assertNotEquals("ill",setUpNewEndangeredAnimal.getHealth());
    }

    public void setLocation(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        setUpNewEndangeredAnimal.setLocation("nairobi");
        assertNotEquals("samburu",setUpNewEndangeredAnimal.getLocation());
    }

    @Test
    public void setRangerName(){
        EndangeredAnimal setUpNewEndangeredAnimal=setUpNewEndangeredAnimal();
        setUpNewEndangeredAnimal.setRangerName("cholo");
        assertNotEquals("sakuda",setUpNewEndangeredAnimal.getRangerName());
    }

    public EndangeredAnimal setUpNewEndangeredAnimal(){
        return new EndangeredAnimal("lion","22","ill","samburu","sakuda");
    }
}
