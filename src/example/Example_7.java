package example;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_7 {
    private static List<String> listLine;
    private static List<String> readLine(String filename) throws IOException {
        listLine = new LinkedList<String>();
        String s;
        BufferedReader input = new BufferedReader(new FileReader(filename));
        while ((s = input.readLine()) != null) {
            listLine.add(s + "\n");
        }
        input.close();
        Collections.reverse(listLine);
        return listLine;
    }
    public static void main(String[] args) throws IOException {
        List<String> result = readLine("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\BufferedInputFile.java");
        for (String line : result) {
            System.out.print(line);
        }
    }
}
