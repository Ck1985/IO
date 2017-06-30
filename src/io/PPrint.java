package io;

import java.util.*;
/**
 * Created by anonymous.vn1985@gmail.com
 */
public class PPrint {
    public static String pformat(Collection<?> c) {
        if (c.size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (Object object : c) {
            if (c.size() != 1) sb.append("\n ");
            sb.append(object);
        }
        if (c.size() != 1) sb.append("\n");
        sb.append("]");
        return sb.toString();
    }
    public static void pprint(Collection<?> c) {
        System.out.println(pformat(c));
    }
    public static void pprint(Object[] c) {
        System.out.println(pformat(Arrays.asList(c)));
    }
}
