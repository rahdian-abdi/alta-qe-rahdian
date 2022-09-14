package com.assignment.oop.volume;

public class Tube extends Main {
    private double radius;
    private double tinggi;

    public Tube(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double volumeTabung(){
        return Math.round(3.14 * Math.pow(radius, 2) * tinggi);
    }
}
