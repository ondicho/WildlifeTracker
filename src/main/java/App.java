import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.Sql2oAnimalDao;
import dao.Sql2oEndangeredAnimalDao;
import models.Animal;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String connectionString = "jdbc:postgresql:wildlife_tracker";
        Sql2o sql2o = new Sql2o(connectionString, "ondicho", "1234");
        Sql2oAnimalDao animalDao = new Sql2oAnimalDao(sql2o);
//        Sql2oEndangeredAnimalDao endangeredAnimalDao = new Sql2oEndangeredAnimalDao(sql2o);

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Animal> allSightings = animalDao.getAll();
            model.put("animals", allSightings);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/new-sightings", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
//            List<Animal> allSightings = animalDao.getAll();
//            model.put("animals", allSightings);
            return new ModelAndView(model, "new-sightings.hbs");
        }, new HandlebarsTemplateEngine());

        get("/endangered-sightings", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
//            List<Animal> allSightings = animalDao.getAll();
//            model.put("animals", allSightings);
            return new ModelAndView(model, "endangered-sightings.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
