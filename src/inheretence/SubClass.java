package inheretence;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

class SuperClass {
    public String processData(Object... data) {
        // A valid body
        return "";
    }
}

class SubClass extends SuperClass {
    // Method 1
    public String processData(String... data) {
        // A valid body
        return "";
    }

    // Method 2
    public String processData(Integer[] data) {
        // A valid body
        return "";
    }

    // Method 3
    public String processData(Object[] data) {
        // A valid body
        return "";
    }

    // Method 4
    public String processData(Object data) {
        // A valid body
        return "";
    }

    /*
    void methodA(int[] data) {

    }

    void methodA(int ...data){

    }
     */
//    void  method() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            writer.write("test");
//        } finally {
//            try {
//                if (writer != null) writer.close();
//            } catch (IOException e) {}
//        }
//    }



}
