package jenkovTutorial.standardIO;

import java.io.*;
/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Exchange {
    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\System.out.txt");
            PrintStream printStream = new PrintStream(output);
            System.setOut(printStream);
            output.flush();
            output.close();
        } catch (IOException ex){

        }
    }
}
