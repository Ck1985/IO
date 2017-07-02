package example;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_8_9_10 {
    private static List<String> listLine = null;
    public static List<String> readAndReverse(String filename) throws IOException {
        listLine = new LinkedList<>();
        BufferedReader input = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = input.readLine()) != null) {
            listLine.add(s + "\n");
        }
        input.close();
        Collections.reverse(listLine);
        return listLine;
    }
    private static boolean findWord(List<String> list, String[] args) {
        List<String> argsList = Arrays.asList(args);
        if (!Collections.disjoint(list,argsList)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        List<String> result = readAndReverse("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\BufferedInputFile.java");
        for (String s : result) {
            System.out.print(s.toUpperCase());
        } System.out.println("The lines which has word matches with command line: ");
        for (String line : result) {
            String[] arrayWords = line.split("\\W+");
            List<String> listWords = Arrays.asList(arrayWords);
            if (findWord(listWords,args)) {
                System.out.println(line);
            }
        }
    }
}
