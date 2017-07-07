package io;

import java.util.*;
import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class TextFile extends ArrayList<String> {
    public static String read(String filename) {
        StringBuilder sp = new StringBuilder();
        try {
            BufferedReader input = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = input.readLine()) != null) {
                    sp.append(s);
                    sp.append("\n");
                }
            } finally {
                input.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return sp.toString();
    }
    public static void write(String filename, String text) {
        try {
            PrintWriter output = new PrintWriter(new File(filename).getAbsoluteFile());
            try {
                output.print(text);
            } finally {
                output.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public TextFile(String filename, String spliter) {
        super(Arrays.asList(read(filename).split(spliter)));
        if (this.get(0).equals(" ")) this.remove(0);
    }
    public TextFile(String filename) {
        this(filename,"\n");
    }
    public void write(String filename) {
        try {
            PrintWriter output = new PrintWriter(new File(filename).getAbsoluteFile());
            try {
                for (String line : this) {
                    output.println(line);
                }
            } finally {
                output.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) {
        String file = read("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\TextFile.java");
        write("C:\\Users\\anony\\Documents\\Directory_Data\\Test.txt",file);
        TextFile file2 = new TextFile("C:\\Users\\anony\\Documents\\Directory_Data\\Test.txt");
        file2.write("C:\\Users\\anony\\Documents\\Directory_Data\\Test2.txt");
        TreeSet<String> words = new TreeSet<String>(new TextFile("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\TextFile.java","\\W+"));
        //System.out.println(words.headSet("a"));
        TextFile file3 = new TextFile("C:\\Users\\anony\\Documents\\Directory_Data\\Test.txt","\\W+");
        for (String str : file3) {
            System.out.print(str + " ");
        }
    }
}
