package jenkovTutorial.bufferedInputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\characteroutput.txt";
        InputStream inputStream = new BufferedInputStream(new FileInputStream(filename));
        int bufferSize = 8 * 1024;
        InputStream input = new BufferedInputStream(new FileInputStream(filename),bufferSize);
    }
}
