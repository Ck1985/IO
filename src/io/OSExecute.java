package io;

import java.io.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class OSExecute {
    public static void command(String command) {
        boolean err = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader result = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = result.readLine()) != null) {
                System.out.println(s);
            }
            BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((s = error.readLine()) != null) {
                System.out.println(s);
                err = true;
            }
        } catch (Exception ex) {
            if (!command.startsWith("CMD /C")) {
                command = "CMD /C" + command;
            } else {
                throw new RuntimeException(ex);
            }
        }
        if (err) {
            throw new OSExecuteException("Error executing: " + command);
        }
    }
}
