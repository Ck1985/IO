package example;

import java.util.*;
import java.io.*;
import net.mindview.util.*;
import java.util.regex.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class example_1c {
    public static void main(final String[] args) {
        File abstractPath = new File("C:\\Users\\anony\\Documents\\New Folder\\");
        final String root = "C:\\Users\\anony\\Documents\\New Folder\\";
        final String[] resultArray;
        final Pattern pattern;
        if (args.length < 2) {
            resultArray = abstractPath.list();
            System.out.println("Usage: input regex and argument file to filter");
        } else {
            pattern = Pattern.compile(args[0]);
            resultArray = abstractPath.list(new FilenameFilter() {
                public boolean accept(File dir, String filename) {
                    return pattern.matcher(filename).matches()
                            &&
                            !(Collections.disjoint(Arrays.asList(args).subList(1,args.length),Arrays.asList(TextFile.read(root + filename).split("\\W+"))));
                }
            });
        }
        Arrays.sort(resultArray, String.CASE_INSENSITIVE_ORDER);
        for (String file : resultArray) {
            System.out.println(file);
        }
    }
}
