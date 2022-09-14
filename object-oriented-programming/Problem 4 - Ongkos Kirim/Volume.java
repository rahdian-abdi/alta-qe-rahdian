package com.assignment.oop.ongkoskirim;

public class Volume extends Main{

    public Volume(double weight, double length, double breadth, double depth) {
        super(weight, length, breadth, depth);
    }

    public double volumeCal(){
        double volume = length * breadth * depth;
        double volumeRound = 0;
        if(Math.round(volume) < 50){
            volumeRound = 50;
        } else {
            volumeRound = volume;
        }

        return (Math.ceil(volumeRound/50))*5000;
    }
}
