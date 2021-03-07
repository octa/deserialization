package com.cub.commoncollections;

import java.io.*;

public class ApacheCommonCollections {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = Constants.path;
        FileInputStream fileInputStream = new FileInputStream(new File(path+"commoncollections/ApacheCommonCollectionsExploit.ser"));
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        Object modelClass1 = (Object) in.readObject();
        in.close();
        fileInputStream.close();

    }

}