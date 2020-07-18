package com.belajar.java;

import java.util.Scanner;

public class ForBersarang {

    public static void main(String[] args) {

        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Scanner inputUser = new Scanner(System.in);
//        System.out.print("Masukkan Angka : ");
//        int nilai = inputUser.nextInt();
//
//        for (int i = 1; i <= nilai; i++) {
//
//            for (int j = i; j <= nilai; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 0; k <= (i*2)-2; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
