package example;

import java.util.*;
import java.io.*;
import nu.xom.*;
import net.mindview.util.TextFile;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Example_32 {
    public static Map<String,Integer> resultMap;
    private static Map<String,Integer> countOccurenceWords(String filename) {
        resultMap = new HashMap<>();
        TextFile textFile = new TextFile(filename, "\\W+");
        for (String word : textFile) {
            if (!resultMap.containsKey(word)) {
                resultMap.put(word, 1);
            } else {
                resultMap.put(word, resultMap.get(word) + 1);
            }
        }
        return resultMap;
    }
    public static Element storeXML() {
        Element root = new Element("Words");
        Element entry = null;
        Element key = null;
        Element value = null;
        Set<Map.Entry<String,Integer>> entrySet = resultMap.entrySet();
        for (Map.Entry<String,Integer> ent : entrySet) {
            key = new Element("Key");
            value = new Element("Value");
            entry = new Element("Entry");
            key.appendChild(ent.getKey());
            value.appendChild(ent.getValue().toString());
            entry.appendChild(key);
            entry.appendChild(value);
            root.appendChild(entry);
        }
        return root;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        Set<Map.Entry<String,Integer>> entrySet = resultMap.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet) {
            result.append(entry.getKey() + " = " + entry.getValue() + "\n");
        }
        return result.toString();
    }
    public static void format(OutputStream os, Document doc) throws Exception {
        Serializer serializer = new Serializer(os, "UTF-8");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }
    public static void main(String[] args) throws Exception {
        String filename = "C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Company.java";
        Example_32.countOccurenceWords(filename);
        Example_32 ex = new Example_32();
        System.out.println(ex);
        Element root = storeXML();
        Document doc = new Document(root);
        format(System.out, doc);
        format(new BufferedOutputStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Example_32.out")), doc);
    }
}
