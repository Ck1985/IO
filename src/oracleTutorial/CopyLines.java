package oracleTutorial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\characteroutput.txt"));
            String line;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
