import java.io.File;
import java.io.IOException;

public class FileCreateTests {
    public static void main(String[] args) throws IOException {
        //Create empty file
        File file = new File("./files/new.txt");

        System.out.println("file.exists() = " + file.exists());

        //Create empty file
        file.createNewFile();
    }
}
