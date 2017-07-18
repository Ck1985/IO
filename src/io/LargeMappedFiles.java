package io;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class LargeMappedFiles {
    private static final int length = 0x8FFFFFF;
    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt","rw").getChannel().map(FileChannel.MapMode.READ_WRITE,0,length);
        for (int i = 0; i < length; i++) {
            out.put((byte)'x');
        }
        System.out.println("Finishing writing");
        for (int i = length / 2; i < length / 2 + 6; i++) {
            System.out.print((char)out.get(i) + " ");
        }
        System.out.println();
    }
}
