package example;

import java.io.*;
import io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_13 {
    static String outFile = "C:\\Users\\anony\\Documents\\Directory_Data\\Example_13Out.out";
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(BufferedInputFile.read("C:\\Users\\anony\\Documents\\Directory_Data\\Company.java")));
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        LineNumberReader numLine = new LineNumberReader(input);
        String s;
        LineNumberReader input_2 = new LineNumberReader(new FileReader("C:\\Users\\anony\\Documents\\Directory_Data\\Company.java"));

        while (((s = input_2.readLine()) != null)) {
            output.println(input_2.getLineNumber() + ": " + s);
        }
        output.close();
    }
}
