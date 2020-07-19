package com.belajar.java;

public class Hewan {

    String nama;
    int berat;
    int jumlahKaki;

//    public void cetakNama(String nama) {
//        System.out.println("Nama Hewan " + nama);
//    }

    // Ini merupakan konstruktor dari kelas hewan. Konstruktor adalah method yang
    // pertama kali dijalankan ketika objek diciptakan
    public Hewan(String namahewan) {
        nama = namahewan;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKaki(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama Hewan        : " + nama);
        System.out.println("Berat Hewan       : " + berat + " Kg");
        System.out.println("Jumlah Kaki Hewan : " + jumlahKaki);
        System.out.println();
    }
}
