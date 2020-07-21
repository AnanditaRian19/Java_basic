package com.belajar.java;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static boolean isLanjutkan = true;
    private static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] Args) {

        // Kamus
        PersegiPanjang mPersegi;
        SegitigaSiku mSegitiga;
        Lingkaran mLingkaran;
        int s1, s2, r;
//        boolean isLanjutkan = true;

        mPersegi = new PersegiPanjang();
        mSegitiga = new SegitigaSiku();
        mLingkaran = new Lingkaran();

        // Program
        // Panggil Metode

        while (isLanjutkan) {
            mainMenu();
            // Kondisional untuk pilihan mene yang dimasukan
            switch (pilihan) {
                case '1': {
                    System.out.print("Masukkan Panjang Persegi : ");
                    s1 = inputUser.nextInt();
                    System.out.print("Masukkan Lebar Persegi   : ");
                    s2 = inputUser.nextInt();

                    System.out.println("Luas Persegi Panjang     : " + mPersegi.luas(s1, s2));
                    System.out.println("Keliling Persegi Panjang : " + mPersegi.keliling(s1, s2));
                    break;
                }
                case '2': {
                    System.out.print("Masukkan Alas Segitiga Siku : ");
                    s1 = inputUser.nextInt();
                    System.out.print("Masukkan Tinggi Segitiga Siku : ");
                    s2 = inputUser.nextInt();
                    System.out.println("Luas Segitiga   : " + mSegitiga.luas(s1, s2));
                    System.out.println("Tinggi Segitiga : " + mSegitiga.keliling(s1, s2));
                    break;
                }
                case '3': {
                    System.out.print("Masukkan Jari-jari Lingkaran : ");
                    r = inputUser.nextInt();
                    System.out.println("Luas Lingkaran     : " + mLingkaran.luas(r));
                    System.out.println("Keliling Lingkaran : " + mLingkaran.keliling(r));
                    break;
                }
                case '4': {
                    System.exit(0);
                }
                default:
                    System.err.println("Pilih Menu 1 - 5");
            }
            isLanjutkan = getYesOrNo("Ulangi");
        }
    }

    private static boolean getYesOrNo(String message) {
        System.out.print("\n" + message + " (y/n) ? ");
//        String pilihan = inputUser.next();
        String pilih = String.valueOf(pilihan);
        pilih = inputUser.next();

        while (!pilih.equalsIgnoreCase("y") && !pilih.equalsIgnoreCase("n")) {
            System.out.println("Keyword Salah");
            System.out.print("\n" + message + " (y/n) ? ");
            pilih = inputUser.next();
        }

        return pilih.equalsIgnoreCase("y");
    }

    private static void mainMenu() {
        // Pilihan Menu
        System.out.println("========================");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Menu : ");
        pilihan = inputUser.next().charAt(0);
        System.out.println();
    }
}
