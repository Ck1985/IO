package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class MakeDirectories {
    private static void usage() {
        System.err.println(
                "Usage: MakeDirectories path1 ......\n" +
                "Create each path" +
                        "Usage: MakeDirectories -d path1 .....\n" +
                        "Delete each path" +
                        "Usage: MakeDirectories -r path1 path2 \n" +
                        "Rename from path1 to Path2"
        );
        System.exit(1);
    }
    private static void fileData(File file) {
        System.out.println(
                "Absolute Path: " + file.getAbsolutePath() +
                        "\n Can read: " + file.canRead() +
                        "\n Can write: " + file.canWrite() +
                        "\n get Name: " + file.getName() +
                        "\n get Parent: " + file.getParent() +
                        "\n get Path: " + file.getPath() +
                        "\n get Length: " + file.length() +
                        "\n gst LastModify: " + file.lastModified()
        );
        if (file.isDirectory()) {
            System.out.println("It is a directory");
        } else {
            System.out.println("It is a file");
        }
    }
    public static void main(String[] args) {
        if (args.length < 0) {
            usage();
        }
        if (args[0].equals("-r")) {
            if (args.length != 3) usage();
            File
                    old = new File(args[1]),
                    rename = new File(args[2]);
            System.out.println(old.renameTo(rename));
            fileData(old);
            fileData(rename);
            return;
        }
        int count = 0;
        boolean del = false;
        if (args[0].equals("-d")) {
            count++;
            del = true;
        }
        count--;
        while(++count < args.length) {
            File f = new File(args[0]);
            if (f.exists()) {
                System.out.println(f + " exists");
                if (del) {
                    System.out.println("deleting...." + f);
                    f.delete();
                }
            } else {
                if (!del) {
                    f.mkdirs();
                    System.out.println("Created " + f);
                }
            }
            fileData(f);
        }
    }
}
