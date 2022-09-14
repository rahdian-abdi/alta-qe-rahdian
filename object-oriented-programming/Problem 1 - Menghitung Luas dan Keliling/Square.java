package com.assignment.oop.luaskeliling;

public class Square extends Main {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double luasPersegi(){
        return Math.pow(side, 2);
    }

    public double kelilingPersegi(){
        return side * 4;
    }
}
