package jenkovTutorial.byteArrayOutputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ByteArrayOutputStreamExample {
    public static void main(String[] args)throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] bytes = {1,2,3,4,5};
        output.write(bytes);
    }
}
