package com.assignment.oop.volume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Geometry (Tabung/Kubus/Balok): ");
        String inputVol = input.nextLine();
        switch (inputVol.toLowerCase()){
            case "tabung":
                System.out.println("Input Tube Radius: ");
                double inputTubeRadius = input.nextDouble();
                System.out.println("Input Tube Height: ");
                double inputTubeHeight = input.nextDouble();
                Tube tube = new Tube(inputTubeRadius, inputTubeHeight);
                System.out.println("Tube Volume: " + tube.volumeTabung());
                break;
            case "balok":
                System.out.println("Input Beam Length: ");
                double inputBeamLength = input.nextDouble();
                System.out.println("Input Beam Width: ");
                double inputBeamWidth = input.nextDouble();
                System.out.println("Input Beam Height: ");
                double inputBeamHeight = input.nextDouble();
                Beam beam = new Beam(inputBeamLength, inputBeamWidth, inputBeamHeight);
                System.out.println("Tube Volume: " + beam.volumeBalok());
                break;
            case "kubus":
                System.out.println("Input Cube Side: ");
                double inputCubeSide = input.nextDouble();
                Cube cube = new Cube(inputCubeSide);
                System.out.println("Cube Volume: " + cube.volumeKubus());
                break;
            default:
                System.out.println("Geometry not available!");
        }







    }
}
