package com.belajar.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildCard {

    public static void main(String[] args) {

        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

//        print(ls); // Baris ini valid

        Collection<Planet> cp = new ArrayList<>();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.06));

//        print(cp); // Baris ini valid
    }

//    public static void print(Collection<?> collection) { // Perubahan ada id baris ini
    static <T> void arrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            System.out.println(o);
        }
    }
}
