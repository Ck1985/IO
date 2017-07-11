package jenkovTutorial.pipedOutputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class PipedOutputStreamExample {
    public static boolean hasMoreData(){return true;}
    public static int getData() {return 1;}
    public static void main(String[] args) throws IOException {
        PipedInputStream input = null;
        PipedOutputStream output = new PipedOutputStream(input);
        while (hasMoreData()) {
            int data = getData();
            output.write(data);
        }
        output.close();
    }
}
