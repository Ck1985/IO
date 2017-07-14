package example;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class OSExecute_22 {
    public static List<String> command(String command) {
        boolean err = false;
        List<String> list = new ArrayList<>();
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader result = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = result.readLine()) != null) {
                list.add(s);
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
            throw new OSExecuteException_22("Error executing: " + command);
        }
        return list;
    }
}
