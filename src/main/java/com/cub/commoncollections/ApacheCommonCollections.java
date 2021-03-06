package com.cub.commoncollections;

import com.cub.ModelClass;

import java.io.*;

public class ApacheCommonCollections {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(new File("/tmp/ApacheCommonCollectionsExploit.ser"));
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        ModelClass modelClass1 = (ModelClass) in.readObject();
        in.close();
        fileInputStream.close();

        System.out.println(modelClass1.getName());

    }

}