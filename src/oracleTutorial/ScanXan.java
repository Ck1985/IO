package oracleTutorial;

import java.io.*;
import java.util.Scanner;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\xanadu.txt")));
            scan.useDelimiter("a");
            while (scan.hasNext()) {
                System.out.println(scan.next());
            }
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
