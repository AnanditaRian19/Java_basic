package com.belajar.java.setplanet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {

    public static void main(String[] args) {

        // Menggunkan HasSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // Method add() untuk menambahkan objek ke set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // Menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // Onjek bisa terus di tambahkan

        // Method size() untuk mendapatkan ukuran set
        System.out.println("Set planets awal : (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // Method remove() untuk mengeluarkan objek dari set

        System.out.println();
        System.out.println("Set planet akhit : (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // Looping menggunakan iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
