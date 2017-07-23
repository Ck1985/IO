package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FreezeAlien {
    public static void main(String[] args) throws Exception{
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\anony\\Documents\\IntelliJ_Projects\\IO\\src\\io\\X.file")
        );
        Alien quellek = new Alien();
        out.writeObject(quellek);
    }
}
