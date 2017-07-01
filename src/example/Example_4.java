package example;

import java.util.*;
import java.util.regex.*;
import java.io.*;
import io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_4 {
    public static long sumSize(String stringPath, String regex) {
        Directory.TreeInfo treeInfo = Directory.walk(stringPath, regex);
        long sumSize = 0;
        for (File file : treeInfo.files) {
            sumSize += file.length();
        }
        return sumSize;
    }
    public static void main(String[] args) {
        System.out.println(sumSize("C:\\Users\\anony\\Documents\\Directory_Data",".*\\.java") );
    }
}
