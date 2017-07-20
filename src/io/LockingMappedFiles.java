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
        new LockAndModify(out,0,0 + LENGTH / 3);
        new LockAndModify(out,LENGTH / 2, LENGTH / 2 + LENGTH / 4);
    }
    private static class LockAndModify extends Thread {
        private ByteBuffer buffer;
        private int start, end;
        LockAndModify(ByteBuffer buffer, int start, int end) {
            this.start = start;
            this.end = end;
            buffer.limit(end);
            buffer.position(start);
            this.buffer = buffer.slice();
            this.start();
        }
        public void run() {
            try {
                FileLock fl = fc.lock(start, end, false);
                System.out.println("Locked from: " + start + " to: " + end);
                while (this.buffer.position() < this.buffer.limit() - 1) {
                    this.buffer.put((byte)(this.buffer.get() + 1));
                }
                fl.release();
                System.out.println("Release from: " + start + " to: " + end);
            } catch(IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
