package serialize;

import java.io.*;

public class ContactSerializeTests {
    public static void main(String[] args) throws IOException {
        Contact contact = new Contact();

        contact.setName("John");
        contact.setEmail("john.doe@gmail.com");
        contact.setPhone("093093093");
        contact.setAge(29);

        OutputStream fileOutputStream = new FileOutputStream("./contact.bin");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(contact);
        objectOutputStream.flush();

        fileOutputStream.close();
    }
}
