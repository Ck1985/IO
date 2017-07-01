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
                        if (!arg.endsWith("." + this.ext)) {
                            arg += "." + this.ext;
                            strategy.process(new File(arg).getCanonicalFile());
                        }
                    }
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(root.getAbsolutePath(), ".*\\." + this.ext)) {
            strategy.process(file.getCanonicalFile());
        }
    }
    public static void main(String[] args) {
        new ProcessFiles(new Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, "java").start(args);
    }
}
