package io;

import java.nio.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class IntBufferDemo {
    private static final int BISEZ = 1024;
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(BISEZ);
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        intBuffer.put(new int[] {23,89,96,153,234,88,10});
        System.out.println(intBuffer.get(3));
        intBuffer.put(3,1988);
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            int n = intBuffer.get();
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
