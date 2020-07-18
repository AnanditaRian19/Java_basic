package com.belajar.java;

public class OperatorUnary {

    public static void main(String[] args) {

        // Operator Unary
        // + Positif
        // - Negatif
        // ++ Penambahan, peningkatan sebesar 1 poin
        // -- Pengurangan, pengurangan sebesar 1 poin
        // ! Operator logika, membalikan sebuah nilai boolean

        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = + nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);
        System.out.println();

        System.out.println("Operator kompelemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
