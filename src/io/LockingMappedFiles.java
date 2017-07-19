package io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class LockingMappedFiles {
    private static final int LENGTH = 0x8FFFFFF;
    private static FileChannel fc = null;
    public static void main(String[] args) throws Exception{
        fc = new RandomAccessFile("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\test.dat","rw").getChannel();
        MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE,0,LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            out.put((byte)'x');
        }

    }
    private static class LockAndModify extends Thread {

    }
}
