package jenkovTutorial.stream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\xanadu.txt");
        output.write("Hello output stream".getBytes());
        output.close();
    }
}
