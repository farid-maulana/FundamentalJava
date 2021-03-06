package com.dicoding.javafundamental.atributmethod;

public class Hewan {

    // atribut atau properti atau fields
    // inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // inisiasi melalui constructor
    int umur;

    // constructor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    // method
    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    void makan() {
        System.out.println("Makan dengan menggunakan mulut..");
    }

    // method dengan nilai balik atau function
    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}
