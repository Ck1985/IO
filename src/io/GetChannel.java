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
        FileChannel fc = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Input_Text.txt").getChannel();

    }
}
