package example;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_15 {
    public static void main(String[] args) throws IOException {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data_15.txt")));
        System.out.println("Initial output.size(): " + output.size());
        byte[] ba = new byte[]{0,1,2,3};
        output.write(ba,0,3);
        output.write(ba);
        output.write((int)255);
        output.writeBoolean(true);
        output.writeByte((int)1000000);
        output.writeBytes((String)"hi");
        output.writeChar((int)120);
        output.writeChars("Hi");
        output.writeDouble(3.14159);
        output.writeFloat(2.1f);
        output.writeInt(1057);
        output.writeLong(123456789L);
        output.writeShort(123);
        output.writeUTF("Nice piece of work");
        System.out.println("After Writing output.size(): " + output.size());
        output.close();

        System.out.println("Reading: ");
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data_15.txt")));
        byte[] baIn = new byte[3];
        System.out.println("Bytes read by input.read(baIn,0,3): " + input.read(baIn,0,3));
        System.out.print("baIn: ");
        for (byte b : baIn) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("input.readInt(): " + input.readInt());
        System.out.println("input.read(): " + input.read());
        System.out.println("input.readBoolean(): " + input.readBoolean());
        System.out.println("input.readByte(): " + input.readByte());
        System.out.println("input.read(): " + input.read());
        System.out.println("input.read(): " + input.read());
        System.out.println("input.readChar(): " + input.readChar());
        System.out.println("input.readChar(): " + input.readChar());
        System.out.println("input.readChar(): " + input.readChar());
        System.out.println("input.readDouble(): " + input.readDouble());
        System.out.println("input.readFloat(): " + input.readFloat());
        System.out.println("input.readInt(): " + input.readInt());
        System.out.println("input.readLong(): " + input.readLong());
        System.out.println("input.readShort(): " + input.readShort());
        System.out.println("input.readUTF(): " + input.readUTF());
    }
}
