package example;

import java.io.*;
import io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_20 {
    public static void main(String[] args) throws IOException {
        List<File> files = Directory.walk("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\out\\production\\IO\\io",".*\\.class").files;
        byte[] bytes;
        for (File file : files) {
            bytes = BinaryFile.read(file);
            for (int i = 0; i < 4; i++) {
                System.out.print(Integer.toHexString(bytes[i] & 0xFF).toUpperCase());
            }
            System.out.println();
        }
    }
}
