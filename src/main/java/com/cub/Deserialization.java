package com.cub;

import java.io.*;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ModelClass modelClass = new ModelClass("Bill", "10");

        FileOutputStream fileOutputStream = new FileOutputStream(new File("/tmp/serialized.ser"));
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(modelClass);
        out.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(new File("/tmp/serialized.ser"));
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        ModelClass modelClass1 = (ModelClass) in.readObject();
        in.close();
        fileInputStream.close();

        System.out.println(modelClass1.getName());

    }
}
