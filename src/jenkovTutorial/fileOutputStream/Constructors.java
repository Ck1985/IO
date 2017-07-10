package jenkovTutorial.fileOutputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Constructors {
    public static void main(String[] args){
        InputStream input = null;
        OutputStream output = null;
        OutputStream output2 = null;
        try {
            input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt");
            output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Output_Text.txt");
            output2 = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\characteroutput.txt",false);
            int data = input.read();
           while (data != -1) {
                output2.write((char)data);
                data = input.read();
           }
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            if (output2 != null) {
                try {
                    output.close();
                    output2.close();
                   input.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
