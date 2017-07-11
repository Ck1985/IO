package jenkovTutorial.files;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt");
        File dir = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Dir1");
        System.out.println(dir.mkdir());
        System.out.println("Input_Text.txt file is exist: " + file.exists());
        File dirs = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Dir2\\SubDir\\SubDir1");
        System.out.println(dirs.mkdirs());
        long lengthFile = file.length();
        System.out.println(lengthFile);
        //Rename or move File
        //File oldFile = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Input_Text.txt");
        //boolean sucessRename = oldFile.renameTo(new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\New_File.txt"));
        //System.out.println(sucessRename);
        File oldFile2 = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Dir1\\Move_File.txt");
        boolean sucessMove = oldFile2.renameTo(new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Dir2\\SubDir\\Move_File.txt"));
        System.out.println(sucessMove);
        File file1 = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\Dir2\\SubDir\\Move_File.txt");
        System.out.println(file1.delete());
        File dir2 = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle");
        System.out.println(dir2.delete());
        File file3 = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Oracle\\xanadu.txt");
        System.out.println(file3.isDirectory());
        String[] filesString = dir2.list();
        for (String str : filesString) {
            System.out.println(str);
        }
        File[] filesObject = dir2.listFiles();
        for (File object : filesObject) {
            System.out.println(object);
        }
    }
}
