package json;

import com.google.gson.Gson;
import serialize.Contact;

public class RawJsonTests {
    public static void main(String[] args) {
        String json = "{\n" +
                "  \"name\": \"John\",\n" +
                "  \"email\": \"john.doe@gmail.com\",\n" +
                "  \"age\": 29,\n" +
                "  \"phone\": \"093093093\"\n" +
                "}";

        Contact contact = new Gson().fromJson(json, Contact.class);
        System.out.println(contact);
    }
}
