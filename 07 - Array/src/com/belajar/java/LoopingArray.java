package com.belajar.java;

public class LoopingArray {

    public static void main(String[] args) {

        // Pengulangan array
        int[] arrInt = new int[100];

        for (int i = 0; i < arrInt.length; i++) {
//            System.out.println(i);
            arrInt[i] = i + 1;
            System.out.println(arrInt[i]);
        }
    }
}
