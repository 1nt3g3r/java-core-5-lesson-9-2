import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileTests {
    public static void main(String[] args) throws IOException {
        File file = new File("./files/empty");

        //Check if file exists
        System.out.println("file.exists() = " + file.exists());

        //Get full (canonical) file path
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

        //Is folder
        System.out.println("file.isDirectory() = " + file.isDirectory());

        //List files
        for (File child : file.listFiles()) {
            System.out.println("child.getCanonicalPath() = " + child.getCanonicalPath());
        }

        //Get parent
        System.out.println("file.getParentFile().getCanonicalPath() = " + file.getParentFile().getCanonicalPath());
    }
}
