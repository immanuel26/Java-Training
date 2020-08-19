package com.immanuel.java.serialize_demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeDemo
{
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\New folder\\user.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        User user = (User) ois.readObject();

        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
    }
}
