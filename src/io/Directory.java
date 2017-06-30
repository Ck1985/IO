package io;

import java.util.regex.*;
import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public final class Directory {
    private static String root = "C:\\Users\\anony\\Documents\\New Folder";
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return this.pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path, final String regex) {
        return local(new File(path),regex);
    }
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();
        public Iterator<File> iterator() {
            return files.iterator();
        }
        public void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }
        public String toString() {
            return "dirs: " + PPrint.pformat(this.dirs) +
                    "\n files: \n" + PPrint.pformat(this.files);
        }
    }
    public static TreeInfo walk(String start, String regex) {
        return recuseDirs(new File(start), regex);
    }
    public static TreeInfo walk(File start, String regex) {
        return recuseDirs(start, regex);
    }
    public static TreeInfo walk(File start) {
        return recuseDirs(start, ".*");
    }
    public static TreeInfo walk(String start) {
        return recuseDirs(new File(start), ".*");
    }
    static TreeInfo recuseDirs(File startDir, String regex) {
        TreeInfo treeInfo = new TreeInfo();
        File[] files = startDir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                treeInfo.dirs.add(file);
                treeInfo.addAll(recuseDirs(file,regex));
            } else {
                if (file.getName().matches(regex)) {
                    treeInfo.files.add(file);
                }
            }
        }
        return treeInfo;
    }
    public static void main(String[] args) {
        System.out.println(walk("C:\\Users\\anony\\Documents\\Directory_Data"));
    }
}
