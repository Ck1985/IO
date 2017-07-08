package oracleTutorial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\xanadu.txt");
            out = new FileWriter("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\characteroutput.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
