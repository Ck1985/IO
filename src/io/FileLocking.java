package io;

import java.io.*;
import java.util.concurrent.*;
import java.nio.channels.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FileLocking {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\File.txt");
        FileLock fl = fos.getChannel().tryLock();
        if (fl != null) {
            System.out.println("Locked File");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
            System.out.println("Released Lock");
        }
        fos.close();
    }
}
