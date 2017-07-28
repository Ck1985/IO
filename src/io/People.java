package io;

import java.util.*;
import java.io.*;
import nu.xom.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class People extends ArrayList<Person> {
    public People(File file) throws Exception {
        Document doc = new Builder().build(file);
        Elements elements = doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size(); i++) {
            this.add(new Person(elements.get(i)));
        }
    }
    public static void main(String[] args) throws Exception {
        String str = "C:\\Users\\anony\\Documents\\Directory_Data\\Data\\People.xml";
        File file = new File(str);
        People p = new People(file);
        System.out.println(p);
    }
}
