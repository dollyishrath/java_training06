package com.trimindtech.training.day06;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("Ishrath.txt");
        if (file.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File is already existed");
        }
    }
}
