package com.belajar.java.listplanet;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {

        // Deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        // Heroes[2] + "zeus"; // ArrayIndexOfBoundsException karena ukuran aray tetap

        // Menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); // Method add() untuk menambahkan objek ke list
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); // Objek lainnya masih bisa terus ditambahkan ke list

        System.out.println("List Planet Awal : ");
        for (int i = 0; i < planets.size(); i++) { // Method size() mendapatkan ukuran List
            // Method get() untuk melihat isi list pada index 1
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("Venus"); // Method remove() untuk mengeluarkan objek dari list

        System.out.println();
        System.out.println("List Planets Akhir : ");
        for (int i = 0; i <planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
