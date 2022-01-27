import java.io.File;

public class FileConstructorTests {
    public static void main(String[] args) {
        File base = new File("files");

        File root = new File(base, "root.txt");

        System.out.println("root.exists() = " + root.exists());
    }
}
