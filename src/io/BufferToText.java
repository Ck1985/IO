package io;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class BufferToText {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());
        buffer.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buffer));
        fc = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());
        fc = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        buffer = ByteBuffer.allocate(24);
        buffer.asCharBuffer().put("Some text");
        fc.write(buffer);
        fc.close();
        fc = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());
    }
}
