package jenkovTutorial.readerAndWriter;

import java.io.*;
/**
 * Created by anonymous.vn1985@gmail.com
 */
public class WriterExample {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\outagain.txt");
        writer.write("This is Writer");
        writer.close();
        //Combine Writer with OutputStream
        OutputStream outputStream = null;
        Writer writer1 = new OutputStreamWriter(outputStream);
        // Combine Reader Writer
        Reader reader = new BufferedReader(new FileReader("abc.txt"));
        Writer writer2 = new BufferedWriter(new FileWriter("xyz.txt"));
    }
}
