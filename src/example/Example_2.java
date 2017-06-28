package example;

import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class SortedDirList {
    private File abstractPath;
    class DirListFilter implements FilenameFilter {
        private Pattern pattern;
        public DirListFilter(String regex) {
            pattern = Pattern.compile(regex);
        }
        public boolean accept(File dir, String filename) {
            return pattern.matcher(filename).matches();
        }
    }
    public SortedDirList(File abstractPath) {
        this.abstractPath = abstractPath;
    }
    public String[] list() {
        return this.abstractPath.list();
    }
    public String[] list(FilenameFilter filter) {
        return this.abstractPath.list(filter);
    }

}
public class Example_2 {
    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList(new File("C:\\Users\\anony\\Documents\\New Folder"));
        String[] allList = sortedDirList.list();
        for (String file : allList) {
            System.out.println(file);
        }
        System.out.println();

        String[] fiterList = sortedDirList.list(sortedDirList.new DirListFilter(".*\\.dat"));
        for (String file : fiterList) {
            System.out.println(file);
        }
    }
}
