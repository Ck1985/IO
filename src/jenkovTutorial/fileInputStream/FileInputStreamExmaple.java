package jenkovTutorial.fileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FileInputStreamExmaple {
    public static void main(String[] args) throws IOException{
        InputStream input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt");
        int data = input.read();
        while (data != -1) {
            doSomthingData(data);
            data = input.read();
        }
        input.close();
    }
    public static void doSomthingData(int data) throws IOException {}
}
