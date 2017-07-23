package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Blip3 implements Externalizable {
    private int i;
    private String s;

    public Blip3() {
        System.out.println("Blip3 Constructor");
    }
    public Blip3(int i, String s) {
        System.out.println("Blip3(int i, String s)");
        this.i = i;
        this.s = s;
    }
    public String toString() {
        return s + i;
    }
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip3.writeExternal()");
        //out.writeObject(s);
        //out.writeInt(i);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip3.readExternal");
        s = (String)in.readObject();
        i = in.readInt();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Constructor objects: ");
        Blip3 b3 = new Blip3(47, "A String");
        System.out.println(b3);
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Blip3.out")
        );
        System.out.println("Saving object:");
        out.writeObject(b3);
        out.close();
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Blip3.out")
        );
        System.out.println("Now recovering it back");
        b3 = (Blip3)in.readObject();
        System.out.println(b3);
    }
}
