package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
/*class Blip1 implements Externalizable {
    public Blip1() {
        System.out.println("Blip1 Constructor");
    }
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blips1.writeExternal()");
    }
    public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
        System.out.println("Blips1.readExternal()");
    }
}*/
class Blip2 implements Externalizable {
    public Blip2() {
        System.out.println("Blips2 Constructor");
    }
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blips2.writeExternal()");
    }
    public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
        System.out.println("Blips2.readExternal()");
    }
}
/*public class Blips {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Constructing object: ");
        Blip1 blip1 = new Blip1();
        Blip2 blip2 = new Blip2();
        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Blips.out")
        );
        System.out.println("Saving objects: ");
        output.writeObject(blip1);
        output.writeObject(blip2);
        output.close();
        System.out.println("Now get them back");
        ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Blips.out")
        );
        System.out.println("Recovering Blip1: ");
        Blip1 b1 = (Blip1)input.readObject();
        //System.out.println("Recovering Blip2: ");
        //Blip2 b2 = (Blip2)input.readObject();
     }
}*/
