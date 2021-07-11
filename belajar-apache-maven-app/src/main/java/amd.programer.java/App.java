package amd.programer.java;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("Akbar Marunduri");
        String per = gson.toJson(person);
        System.out.println(per);

        JsonObject object = new JsonObject();
        object.addProperty("nama", "dfsdfs");

        System.out.println(object);

        Person p = gson.fromJson(object, Person.class);
        System.out.println(p.getNama());
    }
}
