package jenkovTutorial.pipe;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class PipeExample {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream(output);
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    output.write("Hello world! pipe".getBytes());
                } catch (IOException ex) {}
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    int data = input.read();
                    while (data != -1) {
                        System.out.print((char)data);
                        data = input.read();
                    }
                } catch (IOException ex) {}
            }
        });
        thread1.start();
        thread2.start();
    }
}
