package example;

import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\anony\\Documents\\New Folder");
        File[] listFile;
        String root = "C:\\Users\\anony\\Documents\\New Folder\\";
        long totalSize = 0;
        if (args.length == 0) {
            listFile = file.listFiles();
        } else {
            listFile = file.listFiles(new FilenameFilter() {
                private Pattern pattern;
                public boolean accept(File dir, String filename) {
                    pattern = Pattern.compile(args[0]);
                    return pattern.matcher(filename).matches();
                }
            });
        }
        Arrays.sort(listFile);
        for (File file1 : listFile){
            totalSize += file1.length();
        }
        System.out.println("TotalSize : " + totalSize);
    }
}
