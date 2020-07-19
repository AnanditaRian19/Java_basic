package com.belejar.java;

public class KucingAnggora {

    // Ini adalah contoh no-argument contructor
//    public KucingAnggora();


    // Ini adalah contoh parameterized construtor
    String namaKucing;
    int beratBadan;
    // Dengan memberikan nilai awal data namaKucing dan beratBadan
    // Dengan parameter yang kita tentukan
    public KucingAnggora(String nama, int berat) {
        namaKucing = nama;
        beratBadan = berat;
    }
}
