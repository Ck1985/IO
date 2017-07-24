package io;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;
    public Logon(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String toString() {
        return "Logon Information: \n" + "Date: " + date + "\n\t\tName: " + username +
                "\n\t\tPassword: " + password;
    }
    public static void main(String[] args) throws Exception{
        Logon logon = new Logon("Hulk", "littlePony");
        System.out.println("logon: " + logon);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Logon.out")
        );
        out.writeObject(logon);
        out.close();
        TimeUnit.SECONDS.sleep(1);
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Logon.out")
        );
        System.out.println("Now Recovering object at: " + new Date());
        Logon logonRec = (Logon)in.readObject();
        System.out.print("Logon recovered: " + logonRec);
    }
}
