package jenkovTutorial.standardIO;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class StandardIOExample {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("abc.txt");
            System.out.println("File is opened ..... ");
        } catch (IOException ex) {
            System.err.println("File is not found");
        }
    }
}
