import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        
        Map<String, String> map = new HashMap<>();
        map.put("name", "Sam");

        // hello.hbs file is in resources/templates directory
        get("/hello-hbs", (rq, rs) -> new ModelAndView(map, "hello.hbs"), new HandlebarsTemplateEngine());
    }
}
