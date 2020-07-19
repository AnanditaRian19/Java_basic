package com.belajar.java;

public class inputFunction {

    public static void main(String[] args) {

        // Memanggil fungsi
        hitungLuas(7, 6.5);
    }

    private static void hitungLuas(int panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
