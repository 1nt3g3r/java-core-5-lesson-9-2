package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactDeserializeTests {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("contact.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);

        Contact contact = (Contact) objectInputStream.readObject();

        System.out.println("contact = " + contact);
    }
}
