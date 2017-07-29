package example;

import java.io.*;
import java.util.prefs.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_33 {
    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(Example_33.class);
        int value = prefs.getInt("base directory",0);
        System.out.println("base directory value: " + value + "\nEnter new value: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            value = Integer.parseInt(br.readLine());
        } catch(Exception ex) {
            System.err.println(ex);
            System.exit(1);
        }
        prefs.putInt("base directory", value);
    }
}
