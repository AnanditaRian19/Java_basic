package com.belajar.java;

import java.util.Calendar;

public class ExampleSpesificCalendar {

    public static void main(String[] args) {

        // Manampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah : " + calendar.getTime());

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 Hari yang lalu : " + calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 Bulan kemudian : " + calendar.getTime());

        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 Tahun kemudian : " + calendar.getTime());
    }
}
