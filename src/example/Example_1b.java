package example;

import java.util.*;
import net.mindview.util.*;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_1b {
    public static void main(final String[] args) {
        File abstractPath = new File("C:\\Users\\anony\\Documents\\New Folder");
        final String[] resultArray;
        final String root = "C:\\Users\\anony\\Documents\\New Folder\\";
        if (args.length == 0) {
            resultArray = abstractPath.list();
            System.out.println("Usage: java Example_1b input a word to search in file");
            System.exit(0);
        } else {
            resultArray = abstractPath.list(new FilenameFilter() {
                public boolean accept(File dir, String filename) {
                    return !(Collections.disjoint(Arrays.asList(args),new TextFile(root + filename,"\\W+")));
                }
            });
        }
        Arrays.sort(resultArray,String.CASE_INSENSITIVE_ORDER);
        for (String file : resultArray) {
            System.out.println(file);
        }
    }
}
