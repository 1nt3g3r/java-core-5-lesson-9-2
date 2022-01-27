package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import serialize.Contact;

public class JsonTests {
    public static void main(String[] args) {
        Contact contact = new Contact();

        contact.setName("John");
        contact.setEmail("john.doe@gmail.com");
        contact.setPhone("093093093");
        contact.setAge(29);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //to json
        String json = gson.toJson(contact);
        System.out.println(json);

        //from json
        Contact result = gson.fromJson(json, Contact.class);
        System.out.println(result);
    }
}
