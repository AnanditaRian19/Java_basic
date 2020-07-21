package com.belajar.java;

import java.util.Objects;

public class Kucing extends Hewan implements Mamalia {

    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras : " + ras + ", habitat : " + habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Kucing) {
            Kucing other = (Kucing) o;
            return this.ras.equalsIgnoreCase(other.ras);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(ras, habitat);
    }

    public Kucing() {
        super(); //Akan tetap memanggil constructor dari parent class
        System.out.println("Construct Kucing");
    }

    public void makan() { // Overriding
        System.out.println("Kucing sedang makan...");
    }

    public void makan(String food) { // Overloading
        System.out.println("Kucing makan " + food);
    }

    public void makanMinum(String makan, int minum) {
        System.out.println("Makan dan Minum" + makan + minum);
    }
}
