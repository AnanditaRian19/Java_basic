package com.belajar.java;

public class Main {

    public static void main(String[] args) {

        // Menciptakan object dengan nama 'obyekHewan'
//        Hewan obyekHewan = new Hewan();
//        obyekHewan.cetakNama("Tikus");

        // String
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKaki(2);
        Elang.cetakHewan();

        Kucing.beratHewan(2);
        Kucing.jumlahKaki(4);
        Kucing.cetakHewan();
    }

}
