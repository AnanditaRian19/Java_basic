package com.belajar.java;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // contoh pemakaian IF tiga kasus : wujud air

        // kamus
        int T;

        // program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");

        // Scanner untuk memasukan air
        Scanner inputUser = new Scanner(System.in);
        T = inputUser.nextInt(); // Masukan suhu air dengan tipe int

        // prosees pengecekan dengan if
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
