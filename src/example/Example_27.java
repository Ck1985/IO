package example;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class A implements Serializable {
    private int i;
    A(int i) {
        this.i = i;
    }
    public String toString() {
        return "A(" + this.i + ")";
    }
}
class B implements Serializable {
    private char c;
    private A a;
    B(char c, A a) {
        this.c = c;
        this.a = a;
    }
    public String toString() {
        return "B(" + c + a + ")";
    }
}
public class Example_27 implements Serializable {
    private static Random random = new Random(47);
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        B b = new B('x', new A(random.nextInt(10)));
        System.out.println("B: " + b);
        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Example_27.out")
        );
        output.writeObject(b);
        output.close();
        ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Example_27.out")
        );
        B b2 = (B)input.readObject();
        System.out.println("b2: " + b);
    }
}
