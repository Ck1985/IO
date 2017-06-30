package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class ProcessFiles {
    public interface Strategy {
        void process(File file);
    }
    private Strategy strategy;
    private String ext;
    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }
    public void start(String[] args) {
        try {
            if (args.length == 0) {
                this.processDirectoryTree(new File("."));
            } else {
                File fileArg = null;
                for (String arg : args) {
                    fileArg = new File(arg);
                    if (fileArg.isDirectory()) {
                        this.processDirectoryTree(fileArg);
                    } else {

                    }
                }
            }
        } catch (IOException ex) {

        }
    }
    public void processDirectoryTree(File root) throws IOException {

    }
    public static void main(String[] args) {

    }
}
