import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileHandeling {
    //inputStream is stream of data (byte or char)
    public static void main(String[] args) throws IOException {
        // binary stream for pdf ,images ...
        // caracter stream for text
//        byte -> InputStream , outputStream
        // char -> Reader , Writer
//        System.out System.in , System.err are all from printStream
        File file= new File("sample.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos= new FileOutputStream(file);
        fos.write("Hello World".getBytes());
        fos.flush();
        fos.close();

        FileInputStream fis= new FileInputStream(file);
//        byte[] buffer= new byte[1024];
        int length= 0;
        while((length=fis.read())!=-1){
            char c = (char)length;
            System.out.print(c);
        }
        fis.close();

        String text="Hello World test";
        byte[] bytes= text.getBytes();
        ByteArrayInputStream bais= new ByteArrayInputStream(bytes);
        int ch;
        while((ch=bais.read())!=-1){
            System.out.print((char)ch);
        }
        bais.close();


        Scanner scanner= new Scanner(System.in);
        String f=null;
        System.out.println("Enter text:");
        while (!(f=scanner.nextLine()).equals("exit")){
            System.out.println(f);
        }


        Console console= System.console();
        if(console==null){
            System.out.println("No console available");
            return;
        }
        PrintWriter pw= console.writer();
        pw.println("to quit type : exit");
        String txt = null;
        while (!(txt = console.readLine()).equals("exit")){
            pw.println(txt);
        }

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character); // Process one character at a time
        }





    }
}
