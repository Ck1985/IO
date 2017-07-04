package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data.txt")));
        output.writeDouble(3.14159);
        output.writeUTF("That was pi");
        output.writeDouble(1.41413);
        output.writeUTF("Square root of 2");
        output.close();

        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data.txt")));
        System.out.println(input.readDouble());
        System.out.println(input.readUTF());
        System.out.println(input.readDouble());
        System.out.println(input.readUTF());
    }
}
