package io;

import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ZIPCompress {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\TestZip.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream output = new BufferedOutputStream(zos);
        zos.setComment("A Test of Java Zipping");
        for (String arg : args) {
            System.out.println("Writing File: " + arg);
            BufferedReader input = new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c = input.read()) != -1) {
                output.write(c);
            }
            input.close();
            output.flush();
        }
        output.close();
        System.out.println("CheckSum: " + csum.getChecksum().getValue());
        System.out.println("Reading File: ");
        FileInputStream fi = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\TestZip.zip");
        CheckedInputStream csum2 = new CheckedInputStream(fi, new Adler32());
        ZipInputStream input2 = new ZipInputStream(csum2);
        BufferedInputStream bis = new BufferedInputStream(input2);
        ZipEntry ze;
        while ((ze = input2.getNextEntry()) != null) {
            System.out.println("Reading File: " + ze);
            int x;
            while ((x = bis.read()) != -1) {
                System.out.write(x);
            }
        }
        if (args.length == 1) {
            System.out.println("Checksum: " + csum2.getChecksum().getValue());
        }
        bis.close();
        ZipFile zf = new ZipFile("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\TestZip.zip");
        Enumeration en = zf.entries();
        while (en.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry)en.nextElement();
            System.out.println("File: " + zipEntry);
        }
    }
}
