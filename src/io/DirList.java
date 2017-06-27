package io;

import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class DirFilter implements FilenameFilter {
    private String regex;
    private Pattern pattern;
    public DirFilter(String regex) {
        this.regex = regex;
        pattern = Pattern.compile(this.regex);
    }
    public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
    }
}
public class DirList {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\anony\\Documents\\Directory_Data");
        String[] list = null;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
