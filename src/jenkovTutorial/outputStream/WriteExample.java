package jenkovTutorial.outputStream;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class WriteExample {
    public static void main(String[] args) throws IOException{
        OutputStream output = null;
        try {
            output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Output_text.txt");
            while (hasMoreData()) {
                int data = getMoreData();
                output.write(data);
            }
        } catch (IOException ex) {}
        finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ex) {}
            }
        }
    }
    public static boolean hasMoreData() {
        return true;
    }
    public static int getMoreData(){return 1;}
}
