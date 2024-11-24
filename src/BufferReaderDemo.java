import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
//        The BufferedReader class of the java.io package can be used with other readers to read data (in characters) more efficiently.
//
//        Working of BufferedReader
//        The BufferedReader maintains an internal buffer of 8192 characters.
//
//                During the read operation in BufferedReader, a chunk of characters is read from the disk and stored in the internal buffer. And from the internal buffer characters are read individually.
//
//                Hence, the number of communication to the disk is reduced. This is why reading characters is faster using BufferedReader.
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sample.txt"));
        bufferedWriter.write("Hello World1");
        bufferedWriter.close();



        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader bufferedReader1=new BufferedReader(new FileReader("sample.txt"));
            String s = bufferedReader1.readLine();
            System.out.println(s);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
