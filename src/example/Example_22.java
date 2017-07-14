package example;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_22 {
    public static void main(String[] args) {
        for (String s : OSExecute_22.command("javap example.Example_22")) {
            System.out.println(s);
        }
    }
}
