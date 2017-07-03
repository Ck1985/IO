package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FileOutputShortcut {
    private static String file = "C:\\Users\\anony\\Documents\\Directory_Data\\FileOutputShortcut.out";
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(BufferedInputFile.read(
                "C:\\Users\\anony\\Documents\\Directory_Data\\Company.java")
        ));
        PrintWriter output = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = input.readLine()) != null) {
            output.println(lineCount++ + ": " + s);
        }
        output.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
