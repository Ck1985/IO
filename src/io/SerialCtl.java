package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class SerialCtl implements Serializable {
    private String a;
    private transient String b;
    public SerialCtl(String a, String b) {
        this.a = "Not Transient " + a;
        this.b = "Transient " + b;
    }
    public String toString() {
        return this.a + "\n" + this.b;
    }
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(b);
    }
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        b = (String)stream.readObject();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerialCtl sc = new SerialCtl("Test1", "Test2");
        System.out.println("Before: \n" + "\t" + sc);
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buff);
        out.writeObject(sc);
        System.out.println("Now get it back: ");
        ObjectInputStream in = new ObjectInputStream(
                new ByteArrayInputStream(buff.toByteArray())
        );
        SerialCtl scr = (SerialCtl)in.readObject();
        System.out.println("After: " + scr);
    }
}
