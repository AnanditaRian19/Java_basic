package com.belajar.java;

import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] Args) {

        /*try {
            // Mencoba membaca berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);
            // Jika berhasil maka tampilan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan makan tampilkan pesan
            System.out.println(e.getMessage());
        }*/

        int[] a = new int[5];

        try {
            System.out.println("Akses elemen ke-5 : " + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throws : " + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai element terakhir : " + a[4]);
        }
    }
}

