package io;

import java.io.*;
import java.nio.channels.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class TransferTo {
    public static void main(String[] args) throws Exception {
        if (args.length != 2)  {
            System.out.println("Usage: TransferTo sourceFile destinationFile");
            System.exit(1);
        }
        FileChannel
                input = new FileInputStream(args[0]).getChannel(),
                output = new FileOutputStream(args[1]).getChannel();
        input.transferTo(0,input.size(),output);
        //Or:
        //output.transferFrom(input,0,input.size());
    }
}
