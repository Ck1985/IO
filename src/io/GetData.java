package io;

import java.nio.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class GetData {
    private static final int BSIZE = 1024;
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < byteBuffer.limit()) {
            if (byteBuffer.get() != 0) {
                System.out.println("NonZero");
            }
        }
        System.out.println(i);
        byteBuffer.rewind();
        byteBuffer.asCharBuffer().put("Howdy!");
        char c;
        while ((c = byteBuffer.getChar()) != 0) {
            System.out.print(c + " ");
        }
        System.out.println();
        byteBuffer.rewind();
        byteBuffer.asShortBuffer().put((short)471142);
        System.out.print(byteBuffer.getShort());
        System.out.println();
        byteBuffer.rewind();
        byteBuffer.asIntBuffer().put(99471142);
        System.out.println(byteBuffer.getInt());
        byteBuffer.rewind();
        byteBuffer.asLongBuffer().put(99471142);
        System.out.println(byteBuffer.getLong());
        byteBuffer.rewind();
        byteBuffer.asFloatBuffer().put(99471142);
        System.out.println(byteBuffer.getFloat());
        byteBuffer.rewind();
        byteBuffer.asDoubleBuffer().put(99471142);
        System.out.println(byteBuffer.getDouble());
        byteBuffer.rewind();
    }
}
