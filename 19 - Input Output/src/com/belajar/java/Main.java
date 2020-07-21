package com.belajar.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Byte Stream
//        FileInputStream in = null;
//        FileOutputStream out = null;

        // Character Stream
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // Byte Stream
//            in = new FileInputStream("latihanInput.txt");
//            out = new FileOutputStream("latihanOutput.txt");

            // Character Stream
            in = new FileInputStream("latihanInput.txt");
            out = new FileOutputStream("latihanOutput.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
