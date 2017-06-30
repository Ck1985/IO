package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk("C:\\Users\\anony\\Documents\\Directory_Data",".*\\.txt").files);
        for (File file : Directory.local("C:\\Users\\anony\\Documents\\Directory_Data", "H.*")) {
            System.out.println(file);
        }
        System.out.println("----------------------");
// All Java files beginning with ‘T’:
        for(File file : Directory.walk(".", "T.*\\.java"))
            System.out.println(file);
        System.out.println("======================");
// Class files containing "Z" or "z":
        for(File file : Directory.walk(".",".*[Zz].*\\.class"))
            System.out.print(file);
    }
}
