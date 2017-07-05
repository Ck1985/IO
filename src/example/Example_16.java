package example;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_16 {
    private static String file = "C:\\Users\\anony\\Documents\\Directory_Data\\Example_16.dat";
    public static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        byte[] bIn = new byte[3];
        rf.read(bIn);
        for (int i = 0; i < bIn.length; i++) {
            System.out.print(bIn[i] + " ");
        }
        System.out.println();
        System.out.println("rf.readInt(): " + rf.readInt());
        System.out.println("rf.read(): " + rf.read());
        System.out.println("rf.readBoolean(): " + rf.readBoolean());
        System.out.println("rf.readByte(): " + rf.readByte());
        System.out.println("rf.read(): " + rf.read());
        System.out.println("rf.read(): " + rf.read());
        System.out.println("rf.readChar(): " + rf.readChar());
        System.out.println("rf.readChar(): " + rf.readChar());
        System.out.println("rf.readChar(): " + rf.readChar());
        System.out.println("rf.readDouble(): " + rf.readDouble());
        System.out.println("rf.readFloat(): " + rf.readFloat());
        System.out.println("rf.readInt(): " + rf.readInt());
        System.out.println("rf.readLong(): " + rf.readLong());
        System.out.println("rf.readShort(): " + rf.readShort());
        System.out.println("rf.readUTF(): " + rf.readUTF());
        rf.close();
    }
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        byte[] ba = new byte[] {0,1,2,3};
        rf.write(ba,0,3);
        rf.write(ba);
        rf.write(255);
        rf.writeBoolean(true);
        rf.writeByte(1000000);
        rf.writeBytes("hi");
        rf.writeChar(120);
        rf.writeChars("hi");
        rf.writeDouble(3.14159);
        rf.writeFloat(2.1f);
        rf.writeInt(1057);
        rf.writeLong(123456789L);
        rf.writeShort(123);
        rf.writeUTF("Nice piece of work");
        rf.close();
        display();
    }
}
