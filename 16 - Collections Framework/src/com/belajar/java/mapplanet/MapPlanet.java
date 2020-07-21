package com.belajar.java.mapplanet;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] Args) {

        // Menggunakan HashMap
        Map<String, Planet> planetMap = new HashMap<>();
        planetMap.put("Key-1", new Planet("Mercury", 0.06)); // method put() untuk menambahkan objek ke map
        planetMap.put("Key-2", new Planet("Venus", 0.82));
        planetMap.put("Key-3", new Planet("Earth", 1.00));
        planetMap.put("Key-4", new Planet("Mars", 0.11));
        planetMap.put("Key-4", new Planet("Mars-X", 0.11)); // menambahkan ke map dengan key yang sama

        // method size() untuk mendapatkan ukuran set
        System.out.println("Map planets awal : (size = " + planetMap.size() + ")");
        for (String key : planetMap.keySet()) { // Looping key dari map
            // Method get() untuk melihat isi map berdasarkan key
            System.out.println("\t " + key + " : " + planetMap.get(key));
        }

        planetMap.remove("Key-2"); // method remove() untuk mengeluarkan objek dari map

        System.out.println();
        System.out.println("Map planets akhir : (size = " + planetMap.size() + ")");
        for (Planet planet : planetMap.values()) { // Looping value dari map
            System.out.println("\t " + planet);
        }
    }
}
