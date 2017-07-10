package jenkovTutorial.InputStream;

import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class InputStreamExample {
    public static void main(String[] args) {
        InputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_text.txt");
            int data = input.read();
            while (data != -1) {
                //Do something ......
                data = input.read();
            }
        } catch (IOException ex){

        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex){}
            }
        }
    }
}
