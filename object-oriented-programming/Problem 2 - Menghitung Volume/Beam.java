package com.assignment.oop.volume;

public class Beam extends Main {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Beam(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double volumeBalok(){
        return panjang * lebar * tinggi;
    }

}
