package com.cyf.designPattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class jdk {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("D://a.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
