package jenkovTutorial.fileInputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Constructors {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt";
        File file = new File(filename);
        FileInputStream input = new FileInputStream(filename);
        FileInputStream input2 = new FileInputStream(file);
    }
}
