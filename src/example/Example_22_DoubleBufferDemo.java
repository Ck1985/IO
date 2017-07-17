package example;

import java.nio.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_22_DoubleBufferDemo {
    private static final int BSIZE = 1024;
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        DoubleBuffer doubleBuffer = byteBuffer.asDoubleBuffer();
        doubleBuffer.put(new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6});
        System.out.println(doubleBuffer.get(3));
        doubleBuffer.put(3, 1988.88);
        doubleBuffer.flip();
        while (doubleBuffer.hasRemaining()) {
            System.out.print(doubleBuffer.get() + " ");
        }
        System.out.println();
    }
}
