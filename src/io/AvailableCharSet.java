package io;

import java.nio.charset.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class AvailableCharSet {
    public static void main(String[] args) {
        SortedMap<String,Charset> charSets = Charset.availableCharsets();
        Iterator<String> iterator = charSets.keySet().iterator();
        while (iterator.hasNext()) {
            String csName = iterator.next();
            System.out.print(csName);
            Iterator aliases = charSets.get(csName).aliases().iterator();
            if (aliases.hasNext()) {
                System.out.print(": ");
            }
            while (aliases.hasNext()) {
                    System.out.print(aliases.next());
                    if (aliases.hasNext()) {
                        System.out.print(", ");
                    }
            }
            System.out.println();
        }
    }
}
