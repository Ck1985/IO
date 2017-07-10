package jenkovTutorial.InputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ReadMethodsExample {
    public static void main(String[] args) {
        InputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt");
            byte[] data = new byte[1024];
            int readsByte = input.read(data);
            while (readsByte != -1) {
                doSomethingWithData(data,readsByte);
                readsByte = input.read(data);
            }
        } catch (IOException ex){}
        finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex){};
            }
        }
    }
    public static void doSomethingWithData(byte[] bytes, int readsByte){}
}
