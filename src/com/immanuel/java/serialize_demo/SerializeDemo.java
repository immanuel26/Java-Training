package com.immanuel.java.serialize_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo
{
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setUserName("ImmanuelRini");
        user.setPassword("Immrin2603");

        FileOutputStream fos = new FileOutputStream("D:\\New folder\\user.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        System.out.println("User Object got serialized");
    }
}
