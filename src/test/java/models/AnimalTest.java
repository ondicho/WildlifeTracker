package models;

import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void NewAnimalObjectGetsCorrectlyCreated_true() throws Exception {
        Animal animal = new Animal("dikdik","Sakuda");
        assertEquals(true, animal instanceof Animal);
    }

    @Test
    public void getName(){
        Animal setUpNewAnimal=setUpNewAnimal();
        assertEquals("lion",setUpNewAnimal.getName());
    }

    @Test
    public void getRangerName(){
        Animal setUpNewAnimal=setUpNewAnimal();
        assertEquals("sakuda",setUpNewAnimal.getRangerName());
    }

    @Test
    public void setName(){
        Animal setUpNewAnimal=setUpNewAnimal();
        setUpNewAnimal.setName("zebra");
        assertNotEquals("lion",setUpNewAnimal.getName());
    }

    @Test
    public void setRangerName(){
        Animal setUpNewAnimal=setUpNewAnimal();
        setUpNewAnimal.setRangerName("cholo");
        assertNotEquals("sakuda",setUpNewAnimal.getRangerName());
    }

    public Animal setUpNewAnimal(){
        return new Animal("lion","sakuda");
    }
}