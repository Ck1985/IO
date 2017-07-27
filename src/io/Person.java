package io;

import java.io.*;
import java.util.*;
import nu.xom.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class Person {
    private String first, last;
    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public Element getXML() {
        Element person = new Element("person");
        Element firstname = new Element("first");
        firstname.appendChild(first);
        Element lastname = new Element("last");
        lastname.appendChild(last);
        person.appendChild(firstname);
        person.appendChild(lastname);
        return person;
    }
    public Person(Element person) {
        this.first = person.getFirstChildElement("first").getValue();
        this.last = person.getFirstChildElement("last").getValue();
    }
    public String toString() {
        return first + " " + last;
    }
    public static void format(OutputStream os, Document doc) throws IOException {
        Serializer serializer = new Serializer(os,"ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
                new Person("Dr Bunsen","Honeydew"),
                new Person("Gonzo","The Great"),
                new Person("Philip J.", "Fry")
                );
        System.out.println(people);
        Element root = new Element("people");
        for (Person p : people) {
            root.appendChild(p.getXML());
        }
        Document doc = new Document(root);
        format(System.out,doc);
        format(new BufferedOutputStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\People.xml")),doc);
    }
}
