package io;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class GetChannel {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws Exception{
        FileChannel fc = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some Text".getBytes()));
        fc.close();
        fc = new RandomAccessFile("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt","rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();
        fc = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fc.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char)buffer.get());
        }
    }
}
