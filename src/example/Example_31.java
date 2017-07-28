package example;

import java.io.*;
import nu.xom.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class Person {
    private String first, last, address;
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }
    public Element getXML() {
        Element person = new Element("Person");
        Element firstname = new Element("First");
        firstname.appendChild(this.first);
        Element lastname = new Element("Last");
        lastname.appendChild(this.last);
        Element address = new Element("Address");
        address.appendChild(this.address);
        person.appendChild(firstname);
        person.appendChild(lastname);
        person.appendChild(address);
        return person;
    }
    public Person(Element person) {
        this.first = person.getFirstChildElement("First").getValue();
        this.last = person.getFirstChildElement("Last").getValue();
        this.address = person.getFirstChildElement("Address").getValue();
    }
    public String toString() {
        return this.first + " " + this.last + " " + this.address;
    }
    public static void format(OutputStream os, Document doc) throws IOException {
        Serializer serializer = new Serializer(os,"UTF-8");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }
}
class People extends ArrayList<Person> {
    public People(File file) throws Exception {
        Document doc = new Builder().build(file);
        Elements elements = doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size();i++) {
            this.add(new Person(elements.get(i)));
        }
    }
}
public class Example_31 {
    public static void main(String[] args) throws Exception {
        List<Person> peoples = Arrays.asList(
                new Person("Cao", "Quy", "Ha Noi"),
                new Person("Nguyen", "Thu", "Da Nang"),
                new Person("Tran", "Kien", "Sai Gon")
        );
        System.out.println(peoples);
        Element root = new Element("People");
        for (Person person : peoples) {
            root.appendChild(person.getXML());
        }
        Document doc = new Document(root);
        Person.format(System.out,doc);
        Person.format(new BufferedOutputStream(new FileOutputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Example31.out")),doc);
        File file = new File("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\Example31.out");
        People p = new People(file);
        System.out.println(p);
    }
}
