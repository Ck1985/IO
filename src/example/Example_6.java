package example;

import java.util.*;
import io.*;
import java.text.*;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: Directory date(mm/dd/yyy)");
            System.out.println("Output listing all file java in directory " +
                               "\n that modified on or after the given date");
            System.exit(1);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
        new ProcessFiles_5(new ProcessFiles_5.Strategy() {
            public void process(File file) {
                Date modDate = new Date(file.lastModified());
                try {
                    if (modDate.after(sdf.parse(args[1]))) {
                        System.out.println(file);
                    }
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }, ".*\\.java").start(args);
    }
}
