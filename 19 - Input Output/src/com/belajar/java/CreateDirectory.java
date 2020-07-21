package com.belajar.java;

import java.io.File;
import java.lang.reflect.Field;

public class CreateDirectory {

    public static void main(String[] args) {

        String dirName = "/java/latihan1.txt";
//        File file = new File(dirName);
        File file = null;
        String[] paths;

        // Buat Directory
//        file.mkdir();

        try {
            // Instasiasi objek file
            file = new File(dirName);

            // Ambil list files dan masukkan ke aString paths
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {

        }
    }
}
