package com.belajar.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // kamus
        String word = "";
        int vokal = 0;
        int konsonan = 0;
        boolean isLanjutkan = true;

        // Program
        // Masukkan kalimat
        while (isLanjutkan) {
            System.out.print("Masukkan kalimat : ");
            Scanner inputUser = new Scanner(System.in);
            word = inputUser.nextLine();

            // Memanggil prosedur yang mengembalikan nilai int
            vokal = num_vokal(word);
            konsonan = num_konsonan(word);

            System.out.println("Jumlah huruf vokal : " + vokal);
            System.out.println("Jumlah huruf konsonan : " + konsonan);

            isLanjutkan = getYesOrNo("Ulangi");
        }
    }

    private static boolean getYesOrNo(String ulangi) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n" + ulangi + " (y/n)? ");
        String pilihanUser = inputUser.nextLine();

        while (!pilihanUser.equalsIgnoreCase("y") && (!pilihanUser.equalsIgnoreCase("n"))) {
            System.err.print("Pilihan anda tidak tersedia \n");
            System.out.print("\n" + ulangi + " (y/n)? ");
            pilihanUser = inputUser.nextLine();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static int num_vokal(String word) {
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
