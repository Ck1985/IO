package io;

import java.nio.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[] {0,0,0,0,0,0,0,'a'});
        byteBuffer.rewind();
        System.out.println("Byte Buffer: ");
        while (byteBuffer.hasRemaining()) {
            System.out.println(byteBuffer.position() + " ----> " + byteBuffer.get());
        }
        System.out.println();
        CharBuffer charBuffer = ((ByteBuffer)byteBuffer.rewind()).asCharBuffer();
        System.out.println("Char Buffer: ");
        while (charBuffer.hasRemaining()) {
            System.out.println(charBuffer.position() + " ----> " + charBuffer.get());
        }
        System.out.println();
        FloatBuffer floatBuffer = ((ByteBuffer)byteBuffer.rewind()).asFloatBuffer();
        System.out.println("Float Buffer: ");
        while (floatBuffer.hasRemaining()) {
            System.out.println(floatBuffer.position() + " ----> " + floatBuffer.get());
        }
        System.out.println();
        IntBuffer intBuffer = ((ByteBuffer)byteBuffer.rewind()).asIntBuffer();
        System.out.println("Int Buffer: ");
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.position() + " ----> " + intBuffer.get());
        }
        System.out.println();
        System.out.println("Long Buffer: ");
        LongBuffer longBuffer = ((ByteBuffer)byteBuffer.rewind()).asLongBuffer();
        while (longBuffer.hasRemaining()) {
            System.out.println(longBuffer.position() + " ----> " + longBuffer.get());
        }
        System.out.println();
        System.out.println("Short Buffer: ");
        ShortBuffer shortBuffer = ((ByteBuffer)byteBuffer.rewind()).asShortBuffer();
        while (shortBuffer.hasRemaining()) {
            System.out.println(shortBuffer.position() + " ----> " + shortBuffer.get());
        }
        System.out.println();
        System.out.println("Double Buffer: ");
        DoubleBuffer doubleBuffer = ((ByteBuffer)byteBuffer.rewind()).asDoubleBuffer();
        while (doubleBuffer.hasRemaining()) {
            System.out.println(doubleBuffer.position() + " ----> " + doubleBuffer.get());
        }
        System.out.println();
    }
}
