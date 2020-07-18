package com.belajar.java;

import java.util.Scanner;

public class IfThenElseIfThenElse {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");

        int nilaiUjian = inputUser.nextInt();
        char indeksPrestasi;

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else {
            indeksPrestasi = 'E';
        }

        System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
    }
}
