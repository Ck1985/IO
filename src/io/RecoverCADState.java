package io;

import java.io.*;
import java.util.*;

/**
 * Created by anonymous.vn1985@gmail.com
 */
public class RecoverCADState {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException , Exception{
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:\\Users\\anony\\Documents\\Directory_Data\\Data\\CADState.out")
        );
        //List<Class<? extends Shape>> shapeTypes = (List<Class<? extends Shape>>)in.readObject();
        Circle.deSerialStaticState(in);
        Square.deSerialStaticState(in);
        Line.deSerializeStaticState(in);
        List<Shape> shapes = (List<Shape>)in.readObject();
        System.out.println(shapes);
    }
}
