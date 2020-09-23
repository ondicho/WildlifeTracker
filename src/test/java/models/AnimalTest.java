package models;

import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void NewAnimalObjectGetsCorrectlyCreated_true() throws Exception {
        Animal animal = new Animal("dikdik","Sakuda");
        assertEquals(true, animal instanceof Animal);
    }

}