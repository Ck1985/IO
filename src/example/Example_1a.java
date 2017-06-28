package example;

import java.util.*;
import java.io.*;
import net.mindview.util.TextFile;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class FileFilter implements FilenameFilter {
    String[] argsCommand = null;
    String contentFile = null;
    private static final String root = "C:\\Users\\anony\\Documents\\New Folder\\";
    public FileFilter(String[] argsCommand) {
        this.argsCommand = argsCommand;
    }
    public boolean accept(File dir, String filename) {
        contentFile = TextFile.read(root + filename);
        String[] arrayContent = this.contentFile.split(" ");
        if (!Collections.disjoint(Arrays.asList(argsCommand),Arrays.asList(arrayContent))) {
            return true;
        }
        return false;
    }
}
public class Example_1a {
    public static void main(String[] args) {
        File abstractPath = new File("C:\\Users\\anony\\Documents\\New Folder");
        String[] resultFile = null;
        if (args.length == 0) {
            resultFile = abstractPath.list();
        } else {
            resultFile = abstractPath.list(new FileFilter(args));
        }
        Arrays.sort(resultFile, String.CASE_INSENSITIVE_ORDER);
        for (String file : resultFile) {
            System.out.println(file);
        }
    }
}
