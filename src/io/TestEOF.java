package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class TestEOF {
    public static void main(String[] args) throws IOException{
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Company.java")));
        while (input.available() != 0) {
            System.out.print((char)input.readByte());
        }
    }
}
