package io;

import java.io.*;
import java.nio.channels.*;
import java.nio.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class MappedIO {
    private static int numOfInts = 4000000;
    private static int numOfUBuffInts = 200000;
    private abstract static class Tester {
        private String name;
        public Tester(String name) {
            this.name = name;
        }
        public void runTest() {
            System.out.println("Name of Test: " + this.name);
            try {
                long start = System.nanoTime();
                test();
                long duration = System.nanoTime() - start;
                System.out.format("%.2f \n", duration/1.0e9);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        public abstract void test() throws IOException;
    }
    private static Tester[] tests = {
            new Tester("Stream Write") {
                public void test() throws IOException {
                    DataOutputStream dos = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(
                                            new File("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\temp.tmp")
                                    )
                            )
                    );
                    for (int i = 0; i < numOfInts; i++) {
                        dos.writeInt(i);
                    }
                    dos.close();
                }
            },
            new Tester("Mapped Write") {
                public void test() throws IOException {
                    FileChannel fc = new RandomAccessFile("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\temp.tmp","rw").getChannel();
                    ByteBuffer bb = fc.map(FileChannel.MapMode.READ_WRITE,0,fc.size());
                    IntBuffer ib = bb.asIntBuffer();
                    for (int i = 0; i < numOfInts; i++) {
                        ib.put(i);
                    }
                    fc.close();
                }
            },
            new Tester("Stream Read") {
                public void test() throws IOException {
                    DataInputStream dis = new DataInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\temp.tmp")
                            )
                    );
                    for (int i = 0; i < numOfInts; i++) {
                        dis.readInt();
                    }
                    dis.close();
                }
            },
            new Tester("Mapped Read") {
                public void test() throws IOException {
                    FileChannel fc = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\temp.tmp").getChannel();
                    IntBuffer ib = fc.map(FileChannel.MapMode.READ_ONLY,0,fc.size()).asIntBuffer();
                    while (ib.hasRemaining()) {
                        ib.get();
                    }
                    fc.close();
                }
            },
            new Tester("Stream Read/Write") {
                public void test() throws IOException {
                    RandomAccessFile raf = new RandomAccessFile(new File("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\temp.tmp"), "rw");
                    raf.writeInt(1);
                    for (int i  = 0; i < numOfUBuffInts; i++) {
                        raf.seek(raf.length() - 4);
                        raf.writeInt(raf.read());
                    }
                    raf.close();
                }
            },
            new Tester("Mapped Read/Writer") {
                public void test() throws IOException{
                    FileChannel fc = new RandomAccessFile(
                            new File("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\temp.tmp"),"rw"
                    ).getChannel();
                    IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE,0,fc.size()).asIntBuffer();
                    ib.put(0);
                    for (int i = 1; i < numOfUBuffInts; i++) {
                        ib.put(ib.get(i - 1));
                    }
                    fc.close();
                }
            }
    };
    public static void main(String[] args) {
        for (Tester test : tests) {
            test.runTest();
        }
    }
}
