package example;

import java.io.*;
import java.util.*;
import java.util.regex.*;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class ProcessFiles_5 {
    public interface Strategy {
        void process(File file);
    }
    private Strategy strategy = null;
    private String regex;
    public ProcessFiles_5(Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = regex;
    }
    public void start(String[] args) {
        try {
            if (args.length == 0) {
                this.processDirectoryTree(new File("."));
            } else {
                File abstractPath;
                for (String arg : args) {
                    abstractPath = new File(arg);
                    if (abstractPath.isDirectory()) {
                        this.processDirectoryTree(abstractPath);
                    } else {
                        Pattern pattern = Pattern.compile(this.regex);
                        if (pattern.matcher(arg).matches()) {
                            this.strategy.process(abstractPath.getCanonicalFile());
                        }
                    }
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    private void processDirectoryTree(File root) throws IOException {
        for (File file : Directory.walk(root.getAbsolutePath(), this.regex)) {
            strategy.process(file.getCanonicalFile());
        }
    }
}
public class Example_5 {
    public static void main(String[] args) {
        new ProcessFiles_5(new ProcessFiles_5.Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, ".*\\.java").start(args);
    }
}
