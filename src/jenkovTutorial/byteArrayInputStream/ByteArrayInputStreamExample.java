package jenkovTutorial.byteArrayInputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes1 = {1,2,3,4,5};
        byte[] bytes2 = new byte[5];
        ByteArrayInputStream input1 = new ByteArrayInputStream(bytes1);
        int data = input1.read(bytes2);
        input1.close();
        for (byte b : bytes2) {
            System.out.print(b + " ");
        }
    }
}
