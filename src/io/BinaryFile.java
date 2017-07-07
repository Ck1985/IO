package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
        try {
            byte[] arrayByte = new byte[bf.available()];
            bf.read(arrayByte);
            return arrayByte;
        } finally {
            bf.close();
        }
    }
    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }
}
