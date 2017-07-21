package io;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class Data implements Serializable {
    private int n;
    public Data(int n) {
        this.n = n;
    }
    public String toString() {
        return Integer.toString(n);
    }
}
public class Worm implements Serializable {
    private static Random random = new Random(47);
    private Data[] d = {
            new Data(random.nextInt(10)),
            new Data(random.nextInt(10)),
            new Data(random.nextInt(10))
    };
    private Worm next;
    private char c;
    public Worm(int i, char x) {
        System.out.println("Worm Constructor: " + i);
        this.c = x;
        if (--i > 0) {
            next = new Worm(i, (char)(x + 1));
        }
    }
    public Worm() {
        System.out.println("Default Constructor");
    }
    public String toString() {
        StringBuilder result = new StringBuilder(": ");
        result.append(this.c);
        result.append("(");
        for (Data data : this.d) {
            result.append(data + " ");
        }
        result.append(")");
        if (this.next != null) {
            result.append(this.next);
        }
        return result.toString();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Worm worm = new Worm(6, 'a');
        System.out.println("worm: " + worm);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Worm.out")
        );
        out.writeObject("Worm Storage: \n");
        out.writeObject(worm);
        out.close();
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Worm.out")
        );
        String s = (String)in.readObject();
        Worm worm2 = (Worm)in.readObject();
        System.out.println(s + "worm2 = " + worm2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out2 = new ObjectOutputStream(bout);
        out2.writeObject("Worm storage\n");
        out2.writeObject(worm);
        out2.flush();
        ObjectInputStream in2 = new ObjectInputStream(
                new ByteArrayInputStream(bout.toByteArray())
        );
        s = (String)in2.readObject();
        Worm worm3 = (Worm)in2.readObject();
        System.out.println(s + "worm3 " + worm3);
    }
}
