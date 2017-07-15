package io;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("usage: sourceFile destinationFile");
            System.exit(1);
        } else {
            ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
            FileChannel
                    input = new FileInputStream(args[0]).getChannel(),
                    output = new FileOutputStream(args[1]).getChannel();
            while (input.read(buffer) != -1) {
                buffer.flip();
                output.write(buffer);
                buffer.clear();
            }
        }
    }
}
