package jenkovTutorial.arrays;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class WriteArray {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        CharArrayWriter output2 = new CharArrayWriter();
        output.write("This text is converted to byte array".getBytes("UTF-8"));
        byte[] bytes = output.toByteArray();
    }
}
