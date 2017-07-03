package example;

import java.io.*;
import io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_14 {
    private static final String fileOutput1 = "C:\\Users\\anony\\Documents\\Directory_Data\\Example_14Output1.out";
    private static final String fileOutput2 = "C:\\Users\\anony\\Documents\\Directory_Data\\Example_14Output2.out";
    private static final String fileInput = "C:\\Users\\anony\\Documents\\Directory_Data\\Company.java";
    public static long testPerformanceBufferedWriter(String filename) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(BufferedInputFile.read(filename)));
        PrintWriter output_1 = new PrintWriter(new BufferedWriter(new FileWriter(fileOutput1)));
        long duration = 0;
        long start = System.nanoTime();
        String s;
        while ((s = input.readLine()) != null) {
            output_1.println(s);
        }
        duration = System.nanoTime() - start;
        output_1.close();
        return duration;
    }
    public static long testPerformanceUnbufferedWriter(String filename) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(BufferedInputFile.read(filename)));
        PrintWriter output_2 = new PrintWriter(new FileWriter(fileOutput2));
        long duration = 0;
        String s;
        long start = System.nanoTime();
        while ((s = input.readLine()) != null) {
            output_2.println(s);
        }
        duration = System.nanoTime() - start;
        output_2.close();
        return duration;
    }
    public static void main(String[] args) throws IOException  {
        long timeBufferedWriter = testPerformanceBufferedWriter(fileInput);
        long timeUnbufferedWriter = testPerformanceUnbufferedWriter(fileInput);
            System.out.println("time Buffered: " + timeBufferedWriter + " nannoSecond" + "\n" +
                                "time Unbuffered: " + timeUnbufferedWriter + " nanosecond");
            System.out.println("Result: Buffered is faster UnBuffered");

    }
}
