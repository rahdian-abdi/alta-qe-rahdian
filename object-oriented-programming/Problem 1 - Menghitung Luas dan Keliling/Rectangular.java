package com.assignment.oop.luaskeliling;

public class Rectangular extends Main{
    private double panjang;
    private double lebar;

    public Rectangular(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // METHOD
    public double luasPersegiPanjang(){
        return panjang * lebar;
    }

    public double kelilingPersegiPanjang(){
        return (panjang * 2) + (lebar * 2);
    }
}
