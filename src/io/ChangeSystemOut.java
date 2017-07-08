package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter output = new PrintWriter(System.out, true);
        output.println("Hello! World");
    }
}
