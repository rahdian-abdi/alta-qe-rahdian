package com.assignment.oop.volume;

public class Cube extends Main{
    private double sisi;

    public Cube(double sisi){
        this.sisi = sisi;
    }

    public double volumeKubus(){
        return Math.pow(sisi, 3);
    }

}
