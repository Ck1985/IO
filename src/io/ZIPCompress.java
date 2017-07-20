package io;

import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ZIPCompress {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Input_Text.txt");
        CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream output = new BufferedOutputStream(zos);
        zos.setComment("A Test of Java Zipping");
        for (String arg : args) {

        }
    }
}
