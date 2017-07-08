package example;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_21 {
    public static void redirectFile(String filename) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String s;
            try {
                while ((s = input.readLine()) != null) {
                    System.out.println(s);
                }
            } finally {
                input.close();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s;
        redirectFile("C:\\Users\\anony\\Documents\\Directory_Data\\Test2.txt");
        while ((s = input.readLine()) != null && (s.length() != 0)) {
            System.out.println(s);
        }
    }
}
