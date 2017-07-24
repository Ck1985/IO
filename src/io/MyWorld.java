package io;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
class House implements Serializable {

}
class Animal implements Serializable {
    private String name;
    private House referencedHouse;
    public Animal(String name, House referencedHouse) {
        this.name = name;
        this.referencedHouse = referencedHouse;
    }
    public String toString() {
        return "Name: [" + super.toString() + "]" + this.referencedHouse + "\n";
    }

}
public class MyWorld {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        House house = new House();
        List<Animal> list = new ArrayList<>();
        list.add(new Animal("Bosco the dog",house));
        list.add(new Animal("Raph the Hamster", house));
        list.add(new Animal("Molly the cat", house));
        System.out.println("Animals: " + list);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(list);
        out.writeObject(list);
        ByteArrayOutputStream buffer2 = new ByteArrayOutputStream();
        ObjectOutputStream out2 = new ObjectOutputStream(buffer2);
        out2.writeObject(list);
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buffer2.toByteArray()));
        List<Animal>
                animals1 = (List<Animal>)in.readObject(),
                animals2 = (List<Animal>)in.readObject(),
                animals3 = (List<Animal>)in2.readObject();
        System.out.println("Animal1: " + animals1);
        System.out.println("Animals2: " + animals2);
        System.out.println("Animal3: " + animals3);
    }
}
