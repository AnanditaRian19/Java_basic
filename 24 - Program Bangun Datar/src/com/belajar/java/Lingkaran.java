package com.belajar.java;

public class Lingkaran implements BangunDatar {

    private double pi = 3.1415;

    public Lingkaran() {

    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    // Metode Overload
    public double luas(int r) {
        return (pi * r * r);
    }


    // Metode Overload
    public double keliling(int r) {
        return (2 * pi * r);
    }
}
