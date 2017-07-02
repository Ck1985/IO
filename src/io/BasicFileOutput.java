package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class BasicFileOutput {
    static String file = "C:\\Users\\anony\\Documents\\Directory_Data\\BasicFileOutput.out";
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new StringReader(BufferedInputFile.read("C:\\Users\\anony\\Documents\\Directory_Data\\DotNew.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = input.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
