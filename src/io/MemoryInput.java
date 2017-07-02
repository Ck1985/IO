package io;

import java.io.*;
/**
 * Created by anonymous.vn1985@gmail.com
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader input = new StringReader(BufferedInputFile.read("C:\\Users\\anony\\Documents\\Directory_Data\\Company.java"));
        int c;
        while ((c = input.read()) != -1) {
            System.out.print((char)c);
        }
        input.close();
    }
}
