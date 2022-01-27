import java.io.File;

public class FileDirectoryTests {
    public static void main(String[] args) {
        File file = new File("files/dir/subdir");

        System.out.println("file.exists() = " + file.exists());

        System.out.println("file.mkdirs() = " + file.mkdirs());
    }
}
