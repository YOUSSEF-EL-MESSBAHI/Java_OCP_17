package java17Exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) throws IOException {
        char[] buffer= new char[8];
        int count= 0;
        try(FileReader reader= new FileReader("int.txt");
            FileWriter fileWriter = new FileWriter("out.txt")){
            while ((count = reader.read(buffer)) != -1) {
                fileWriter.write(buffer);
            }
        }
    }
}
