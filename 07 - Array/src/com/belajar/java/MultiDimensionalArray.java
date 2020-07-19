package com.belajar.java;

public class MultiDimensionalArray {

    public static void main(String[] args) {

//        char[][] arrChar = new char[2][];
//        arrChar[0] = new char[2];
//        arrChar[1] = new char[3];
//
//        // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
//        arrChar[0][0] = 'A';
//        arrChar[0][1] = 'B';
//
//        // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
//        arrChar[1][0] = 'A';
//        arrChar[1][1] = 'B';
//        arrChar[1][2] = 'C';
//
//        // Tampilkan semua data dari dimesi 1 yang memiliki indeks 0
//        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
//        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
//
//        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
//        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
//        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
//        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);

        int[] arrA = {1,2,3,4};

//        System.out.println(arrA[0]);
//        System.out.println(arrA[1]);
//        System.out.println(arrA[2]);

        // Akses indeks ke 4
//        System.out.println(arrA[4]);

        try {
            System.out.println(arrA[0]);
            System.out.println(arrA[1]);
            System.out.println(arrA[2]);

            System.out.println(arrA[4]);
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("Hanya ada 3 Array");
        } finally {
            System.out.println("Selesai");
        }
    }
}
