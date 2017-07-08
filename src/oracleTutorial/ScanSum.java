package oracleTutorial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ScanSum {
    public static void main(String[] args) throws IOException {
        Scanner scan = null;
        Double sum = 0.0;
        try {
            scan = new Scanner(new BufferedReader(new FileReader("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\USNumbers.txt")));
            scan.useLocale(Locale.US);
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    sum = sum + scan.nextDouble();
                } else {
                    scan.next();
                }
            }
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
        System.out.println(sum);
    }
}
