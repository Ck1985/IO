package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream input = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("" +
                    "C:\\Users\\anony\\Documents\\Directory_Data\\Company.java").getBytes()));
            while (true) {
                System.out.print((char) input.readByte());
            }
        } catch (EOFException ex) {
            System.err.println(ex);
        }
    }
}
