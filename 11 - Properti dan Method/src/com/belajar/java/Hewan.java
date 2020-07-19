package com.belajar.java;

public class Hewan {

    // Property atau fields

    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umurParam) {
        this.umur = umurParam;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelas..");
    }

    void makan() {
        System.out.println("makan dengan mengggunakan mulut..");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}

