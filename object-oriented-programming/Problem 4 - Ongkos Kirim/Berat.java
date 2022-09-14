package com.assignment.oop.ongkoskirim;

public class Berat extends Main{
    public Berat(double weight, double length, double breadth, double depth) {
        super(weight, length, breadth, depth);
    }

    public double weightCal(){
        double weightRound = 0;
        weightRound = Math.round(weight);
        return weightRound * 5000;
    }
}
