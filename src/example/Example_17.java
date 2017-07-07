package example;

import java.io.*;
import java.util.*;
import io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_17 {
    public static void main(String[] args) {
        Map<Character,Integer> mapWords = new HashMap<>();
        //TextFile arrayWords = new TextFile("C:\\Users\\anony\\Documents\\Directory_Data\\Test.txt","\\W+");
        String stringFile = TextFile.read("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\TextFile.java");
        try {
            BufferedReader input = new BufferedReader(new StringReader(stringFile));
            int c;
            char[] arrayChar = new char[stringFile.length()];
            int index = 0;
            try {
                while ((c = input.read()) != -1) {
                    arrayChar[index++] = (char) c;
                }
            } finally {
                input.close();
            }
            for (char c1 : arrayChar) {
                if (!mapWords.containsKey(c1)) {
                    if ((c1 == '\n') || (c1 == ' ')) continue;
                    mapWords.put(c1,1);
                } else {
                    mapWords.replace(c1, mapWords.get(c1) + 1);
                }
            }
            Set<Character> keySet = mapWords.keySet();
            for (Character character : keySet) {
                System.out.println(character + " = " + mapWords.get(character));
            }
            for (char c2 : arrayChar) {
                //System.out.print(c2 + " ");
            }

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
