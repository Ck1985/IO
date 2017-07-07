package example;

import io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_19 {
    public static void main(String[] args) {
        Map<Byte,Integer> mapByte = new HashMap<>();
        try {
            byte[] bytes = BinaryFile.read("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\BinaryFile.java");
            for (byte b : bytes) {
                if (!mapByte.containsKey(b)) {
                    mapByte.put(b,1);
                } else {
                    mapByte.replace(b,mapByte.get(b) + 1);
                }
            }
            for (Byte b : mapByte.keySet()) {
                System.out.println(b + " = " + mapByte.get(b));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
