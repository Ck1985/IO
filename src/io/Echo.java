package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = input.readLine()) != null && (s.length() != 0)) {
            System.out.println(s);
        }
    }
}
