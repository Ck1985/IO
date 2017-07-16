package example;

import java.nio.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_23 {
    public static boolean isPrintable(char c) {
        return ((c >= '!') && (c <= '~')) ? true : false;
    }
    public static void printCharBuffer(CharBuffer buffer) {
        buffer.clear();
        while (buffer.hasRemaining()) {
            char c = buffer.get();
            if (isPrintable(c)) {
                System.out.print(c + " ");
            }
        }
    }
    public static void main(String[] args) {
        char[] ca = {'w', 'x', 'y', 'z'};
        CharBuffer buffer = CharBuffer.wrap(ca);
        System.out.println("CharBuffer by wrapping char[]: ");
        printCharBuffer(buffer);
        System.out.println();
        CharBuffer buffer2 = CharBuffer.allocate(6);
        char[] ca2 = {'s', 't', 'u', 'v', 'w'};
        buffer2.put(ca2);
        System.out.println("CharBuffer by allocating: ");
        printCharBuffer(buffer2);
        System.out.println();
        char[] ca3 = {(char)0x01, (char)0x07, (char)0x7F, 'a', 'b', 'c'};
        CharBuffer buffer3 = CharBuffer.wrap(ca3);
        printCharBuffer(buffer3);
    }
}
