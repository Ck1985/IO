package jenkovTutorial.arrays;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ReadArrays {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        int data = input.read();
        while (data != -1) {
            //do something....
            data = input.read();
        }
        char[] chars = new char[1024];
        CharArrayReader input2 = new CharArrayReader(chars);
        int data2 = input2.read();
        while (data2 != -1) {
            //do something......
            data2 = input.read();
        }
        byte[] bIn = new byte[] {1,2,3,4,5};
        byte[] bOut = new byte[5];
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bIn);
        inputStream.read(bOut);
        for (byte b : bOut) {
            System.out.print(b + " ");
        }

    }
}
