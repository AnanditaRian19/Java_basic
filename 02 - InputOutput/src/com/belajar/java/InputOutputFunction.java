package com.belajar.java;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana\n");

        System.out.print("Masukkan angka pertama : ");
        int value1 = inputUser.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        int value2 = inputUser.nextInt();

        int hasil = value1 + value2;
        System.out.print("Hasilnya adalah : " + hasil);
    }
}
