package com.belajar.java;

public class OperatorConditional {

    public static void main(String[] args) {

        // Operator Conditional
        // && AND
        // || OR

        // AND true & true = true
        // OR true & false = true
        int value1 = 4;
        int value2 = 5;

        System.out.println("Conditional AND");
        boolean hasil = value1 == 3 && value2 == 5;
        boolean hasil2 = value1 != 3 && value2 == 5;

        System.out.println("Hasil operator AND pada syarat value1 == 2 dan value2 == 5 adalah " + hasil);
        System.out.println("Hasil operator AND pada syarat value1 != 2 dan value2 == 5 adalah " + hasil2);
        System.out.println();

        System.out.println("Conditional OR");
        hasil = value1 == 3 || value2 == 5;
        hasil2 = value1 != 3 || value2 == 5;
        System.out.println("Hasil operator OR pada syarat value1 == 2 dan value2 == 5 adalah " + hasil);
        System.out.println("Hasil operator OR pada syarat value1 != 2 dan value2 == 5 adalah " + hasil2);
        System.out.println();
    }
}
