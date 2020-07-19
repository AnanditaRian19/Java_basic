package com.belajar.java;

public class Main {


    public static void main(String[] args) {

        // Kita tambahkan 1 argument dengan nilai int 2
        // Nilai tersebut adalah nilai digunakan untuk inisiasi variabel umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.lari();
        kucing.jalan();

        // Contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah : " + kucing.getUmur());

        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( (tinggi(m) * nilai) * (tinggi(m) * nilai) )
        double hmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah : " + hmi);
    }
}
