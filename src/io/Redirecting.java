package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream input = new BufferedInputStream(new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Input_Text.txt"));
        PrintStream output = new PrintStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Output_Text.txt"));
        System.setIn(input);
        System.setOut(output);
        System.setErr(output);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        output.close();
        System.setOut(console);
    }
}
