package io.xfiles;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(
                new FileInputStream(
                        new File("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io","X.file")
                )
        );
        Object object = input.readObject();
        System.out.println(object.getClass());
    }
}
