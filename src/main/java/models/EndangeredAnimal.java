package models;

import java.util.Objects;

public class EndangeredAnimal extends Animal {

    private String health;
    private String age;
    private String location;


    //constants
    public static final String MAX_HEALTH_LEVEL = "healthy";
    public static final String MID_HEALTH_LEVEL = "okay";
    public static final String MIN_HEALTH_LEVEL = "ill";
    public static final String MAX_AGE_LEVEL = "adult";
    public static final String MID_AGE_LEVEL = "young";
    public static final String MIN_AGE_LEVEL = "newborn";

    public EndangeredAnimal(String name, String age,String health,String location,String rangerName) {
        super(name,rangerName);
        this.age = age;
        this.health = health;
        this.location=location;

    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static String getMaxHealthLevel() {
        return MAX_HEALTH_LEVEL;
    }

    public static String getMidHealthLevel() {
        return MID_HEALTH_LEVEL;
    }

    public static String getMinHealthLevel() {
        return MIN_HEALTH_LEVEL;
    }

    public static String getMaxAgeLevel() {
        return MAX_AGE_LEVEL;
    }

    public static String getMidAgeLevel() {
        return MID_AGE_LEVEL;
    }

    public static String getMinAgeLevel() {
        return MIN_AGE_LEVEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EndangeredAnimal that = (EndangeredAnimal) o;
        return Objects.equals(health, that.health) &&
                Objects.equals(age, that.age) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), health, age, location);
    }
}


