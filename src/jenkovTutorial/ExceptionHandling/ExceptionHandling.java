package jenkovTutorial.ExceptionHandling;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ExceptionHandling {
    /*public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_text.txt");
        int data = input.read();
        while (data != -1) {
            doSomething(data);
            data = input.read();
        }
        input.close();
    }*/
    public static void main(String[] args){
        InputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt");
            int data = input.read();
            while (data != -1) {
                doSomething(data);
                data = input.read();
            }
        } catch (IOException ex) {
            //Do something with exception .......
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    //Do something or ignore ......
                }
            }
        }
    }
    public static void doSomething(int data) throws IOException {}
}
