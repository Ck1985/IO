package io;

import java.io.*;
import java.util.zip.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class GZIPCompress {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: \nGZIPCompress file \n" +
            "\t Using GZIP Compression to compress the file to test.gz");
            System.exit(1);
        } else {
            BufferedReader input = new BufferedReader(new FileReader(args[0]));
            BufferedOutputStream output = new BufferedOutputStream(
                    new GZIPOutputStream(
                            new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\TestGZIP.gz"
                            )
                    )
            );
            System.out.println("Writing File: ");
            int c;
            while ((c = input.read()) != -1) {
                output.write(c);
            }
            input.close();
            output.close();
            System.out.println("Reading file: ");
            BufferedReader input2 = new BufferedReader(
                    new InputStreamReader(
                            new GZIPInputStream(
                                    new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\TestGZIP.gz")
                            )
                    )
            );
            String s;
            while ((s = input2.readLine()) != null) {
                System.out.println(s);
            }
        }
    }
}
