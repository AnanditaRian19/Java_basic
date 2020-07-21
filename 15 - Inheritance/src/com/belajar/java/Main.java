package com.belajar.java;

public class Main {

    public static void main(String[] args) {

        Hewan hewan = new Hewan(); // Memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("--------------------------");

        Kucing kucing = new Kucing(); // Memanggil construtor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("-----------------");

        hewan.makan(); // Kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan();
        kucing.makan("Daging mentah");

        kucing.makanMinum(" nasi ", 5);

        System.out.println("------------------");

        Kucing meow = new Kucing("Ocitat", "Tropis");
        Kucing puss = new Kucing("Ocitat", "subTropis");
        Kucing popo = new Kucing("Anggora", "subTropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("Meow equals puss : " + meow.equals(puss));
        System.out.println("Meow equals popo : " + meow.equals(popo));

        System.out.println("------------------------");

        Object o = new Kucing(); // Kucing adalah object
        Hewan h = new Kucing(); // Kucing adalah hewan
        Kucing k = new Kucing(); // Kucing adalah Kucing, pastinya :)

        // 0.makan(); -> error, karena method makan() tidak ada id class object
        h.makan();
        k.makan();

        Object obj = k; // Bisa lngsung diassign
        Hewan hewank = k; // Bisa langsung diassign

        // object.makan(); -> error, karena method makan() tidak ada di class object
        hewan.makan();

        Kucing kucingK = (Kucing) h; // Tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // Compile OK tetapi runtime error ClassCastException

    }
}
