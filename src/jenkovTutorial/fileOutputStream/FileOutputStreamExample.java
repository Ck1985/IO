package jenkovTutorial.fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Output_Text.txt");
            String filename  = "C:\\abc\\xyz....";
            File file = new File(filename);
            FileOutputStream output3 = new FileOutputStream(file);
            FileOutputStream output2 = new FileOutputStream(filename);
            while (hasMoreData()) {
                int data = getData();
                output.write(data);
            }
        } catch (IOException ex) {}
        finally {
            if (output != null){
                try {
                    output.close();
                } catch (IOException ex){}
            }
        }
    }
    public static boolean hasMoreData() {return true;}
    public static int getData(){return 1;}
}
