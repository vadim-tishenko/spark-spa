import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        boolean devMode = false;
        port(80);
        if (devMode) {
            String projectDir = ".";//System.getProperty("user.dir");
            String staticDir = "/src/main/resources/public";
            staticFiles.externalLocation(projectDir + staticDir);
        } else {
            staticFiles.location("/public");
        }
        get("/hello", (req, res) -> "{ Hello: 'Worldwerrrrrrrr'} "+56789);
        get("/hello2/:name", (req, res) -> "{ Hello2: 'Worldwerrrrrrrr'} "+ req.params(":name"));
        System.out.println("http://localhost:4567/hello");
        System.out.println("http://localhost:4567");
    }
}