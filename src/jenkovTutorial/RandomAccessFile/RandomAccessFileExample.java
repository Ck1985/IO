package jenkovTutorial.RandomAccessFile;

import java.io.*;
import java.io.File;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class RandomAccessFileExample {
    public static void main(String[] args) throws IOException {
        RandomAccessFile input = new RandomAccessFile("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt","rw");
        input.seek(50);
        long filePointer = input.getFilePointer();
        System.out.println(filePointer);
        System.out.print((char)input.read());
        input.write("aaaaaaaaaaaaa".getBytes());
        input.close();
    }
}
