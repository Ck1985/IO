package jenkovTutorial.networking;

import java.io.*;
/**
 * Created by anonymous.vn1985@gmail.com
 */
public class MyClass {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("xxx.txt");
        doSomething(input);
    }
    public static void doSomething(InputStream input) throws IOException{}
}
