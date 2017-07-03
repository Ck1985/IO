package example;

import java.util.*;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_12 {
    private static List<String> listLine;
    private static final String fileOutput = "C:\\Users\\anony\\Documents\\Directory_Data\\Example_12Out.out";
    public static void readAndWrite(String filename) throws IOException{
        BufferedReader input = new BufferedReader(new FileReader(filename));
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(fileOutput)));
        String s;
        int lineCount = 1;
        listLine = new LinkedList<>();
        while ((s = input.readLine()) != null) {
            listLine.add(lineCount++ + ": " + s);
            output.println(s);
        }
        output.close();
    }
    public static void main(String[] args) throws IOException{
        String filename = "C:\\Users\\anony\\Documents\\Directory_Data\\Company.java";
        readAndWrite(filename);
    }
}
