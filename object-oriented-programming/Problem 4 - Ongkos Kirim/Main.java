package com.assignment.oop.ongkoskirim;

import java.util.Scanner;

public class Main {
    double weight;
    double length;
    double breadth;
    double depth;

    public Main(double weight, double length, double breadth, double depth){
        this.weight = weight;
        this.length = length;
        this.breadth = breadth;
        this.depth = depth;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Berat: ");
        double weight = input.nextDouble();
        System.out.println("Input Panjang: ");
        double length = input.nextDouble();
        System.out.println("Input Lebar: ");
        double breadth = input.nextDouble();
        System.out.println("Input Tinggi: ");
        double depth = input.nextDouble();
        Berat berat = new Berat(weight, length, breadth, depth);
        Volume volume = new Volume(weight, length, breadth, depth);

        if(berat.weightCal() > volume.volumeCal()){
            System.out.println("Your shipping fee is: " + berat.weightCal());
        } else {
            System.out.println("Your shipping fee is: " + volume.volumeCal());;
        }
    }
}

