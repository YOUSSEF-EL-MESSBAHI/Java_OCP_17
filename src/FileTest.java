import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("/Earth");
        System.out.print(file.getParent()
                +" - "
                +file.getParent().getParent());

        String parent = file.getParent();
        System.out.print(parent + " - " + (parent != null ? new File(parent).getParent() : null));

    }
}
