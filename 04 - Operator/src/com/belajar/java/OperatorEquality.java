package com.belajar.java;

public class OperatorEquality {

    public static void main(String[] args) {

        // Operator Equality / Relational
        // == Equal to
        // != not equal to
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less than or equal to

        int value1 = 5;
        int value2 = 4;
        boolean hasil;

        System.out.println("Hasil sama dengan");
        hasil = value1 == value2;
        System.out.println("Hasil 'value1 == value2' adalah " + hasil);
        System.out.println();

        System.out.println("Tidak sama dengan");
        hasil = value1 != value2;
        System.out.println("Hasil 'value1 != value2' adalah " + hasil);
        System.out.println();

        System.out.println("Lebih besar");
        hasil = value1 > value2;
        System.out.println("Hasil 'value1 > value2' adalah " + hasil);
        System.out.println();

        System.out.println("Hasil lebih besar atau sama dengan");
        hasil = value1 >= value2;
        System.out.println("Hasil 'value1 >= value2' adalah " + hasil);
        System.out.println();

        System.out.println("Kurang dari");
        hasil = value1 < value2;
        System.out.println("Hasil 'value1 < value2' adalah " + hasil);
        System.out.println();

        System.out.println("Kurang dari atau sama dengan");
        hasil = value1 <= value2;
        System.out.println("Hasil 'value1 <= value2' adalah " + hasil);
        System.out.println();
    }
}
