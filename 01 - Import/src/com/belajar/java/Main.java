package com.belajar.java;

import com.belajar.java.kendaraan.Kereta;
import com.belajar.java.kendaraan.Mobil;
import com.belajar.java.kendaraan.Motor;
import com.belajar.java.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {

    public static void main(String[] Args) {

        System.out.println("Hello World !");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        // Tambah Directory lib lalu masukan library
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }

    // Jadikan Main ke sebuah library
}
