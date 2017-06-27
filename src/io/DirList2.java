package io;

import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class DirList2 {
    private static FilenameFilter filter(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern;
            public boolean accept(File path, String name) {
                pattern = Pattern.compile(regex);
                return pattern.matcher(name).matches();
            }
        };
    }
    public static void main(String[] args) {
        File path = new File("C:\\Users\\anony\\Documents\\Directory_Data");
        String[] fileList = null;
        if (args.length == 0) {
            fileList = path.list();
        } else {
            fileList = path.list(filter(args[0]));
        }
        Arrays.sort(fileList, String.CASE_INSENSITIVE_ORDER);
        for (String file : fileList) {
            System.out.println(file);
        }
    }
}
