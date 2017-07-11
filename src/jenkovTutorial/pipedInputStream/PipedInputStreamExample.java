package jenkovTutorial.pipedInputStream;

import java.io.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class PipedInputStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream output = new PipedOutputStream();
        PipedInputStream input = new PipedInputStream(output);
        int data = input.read();
        while (data != -1) {
            data = input.read();
        }
        input.close();
    }
}
