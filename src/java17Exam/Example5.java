package java17Exam;

import java.io.IOException;

 class Folder implements AutoCloseable {
    public void open(){
        System.out.println("Folder opened");
    }

    @Override
    public void close() {

    }
}
public class Example5 {
    public static void main(String[] args) {
        try(Folder f = new Folder()){
            f.open();
        }
    }
}
