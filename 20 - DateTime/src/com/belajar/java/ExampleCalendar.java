package com.belajar.java;

import java.util.Calendar;

public class ExampleCalendar {

    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}
