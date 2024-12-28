package files;

import java.io.File;

public class FileSeparatorDemo {
    public static void main(String[] args) {
        System.out.println(File.separator);
        System.out.println(File.separatorChar);
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("path.separator"));

//        \
//        \
//        \
//        ;


    }
}
