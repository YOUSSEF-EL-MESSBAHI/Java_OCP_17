import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file= new File("simple.txt");
        file.createNewFile();

        File dir= new File("logs");
        dir.mkdir();

        File destination = new File(dir,"log.txt");
        file.renameTo(destination);

        destination.delete();
        dir.delete();

    }
}
