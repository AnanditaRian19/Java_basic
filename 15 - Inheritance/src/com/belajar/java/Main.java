package com.belajar.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.print("Masukkan angka : ");
            int angka1 = inputUser.nextInt();

            System.out.print("Masukkan angka : ");
            int angka2 = inputUser.nextInt();

            double hasil = Math.pow(angka1,angka2);
            System.out.println("Hasilnya : " + hasil);

            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan");
        }
    }

    private static boolean getYesOrNo(String message) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n" + message + " [y/n]? ");
        String pilihanUser = inputUser.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda tidak tersedia");
            System.out.print("\n" + message + " [y/n]? ");
            pilihanUser = inputUser.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }
}
