package io;

import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class DirList3 {
    public static void main(String[] args) {
        File file = new File(".");
        String[] result = null;
        if (args.length == 0) {
            result = file.list();
        } else {
            result = file.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File file, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
        Arrays.sort(result, String.CASE_INSENSITIVE_ORDER);
        for (String fileName : result) {
            System.out.println(fileName);
        }
    }
}
