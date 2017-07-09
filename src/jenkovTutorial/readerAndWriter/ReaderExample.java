package jenkovTutorial.readerAndWriter;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ReaderExample {
    public static void main(String[] args) throws IOException {
        Reader input = new FileReader("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\outagain.txt");
        int data = input.read();
        while (data != -1) {
            char charData = (char) data;
            data = input.read();
        }
        //Combine Reader with InputStream
        InputStream inputStream = null;
        Reader reader = new InputStreamReader(inputStream);
    }
}
