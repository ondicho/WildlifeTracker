package models;

import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;

public class EndangeredAnimalTest {
    @Test
    public void NewEndangeredAnimalObjectGetsCorrectlyCreated_true() throws Exception {
        EndangeredAnimal endangeredAnimal = new EndangeredAnimal("dikdik","22","ill","samburu","Sakuda");
        assertEquals(true, endangeredAnimal instanceof EndangeredAnimal);
    }

}