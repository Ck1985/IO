package jenkovTutorial.stream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\xanadu");
        int data = input.read();
        while (data != -1) {
            data = input.read();
        }
    }
}
