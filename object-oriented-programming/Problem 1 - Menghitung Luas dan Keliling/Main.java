package com.assignment.oop.luaskeliling;
import java.util.Scanner;


    // CLASS
    public class Main {

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);

            System.out.println("Choose shape(Segitiga/Persegi Panjang/Persegi): ");
            String inputShape = input.nextLine();

            switch (inputShape){
                case "segitiga":
                    System.out.println("Input Triangle Base: ");
                    double inputTriangleBase = input.nextDouble();
                    System.out.println("Input Triangle Height: ");
                    double inputTriangleHeight = input.nextDouble();
                    Triangle triangle = new Triangle(inputTriangleBase, inputTriangleHeight);
                    System.out.println("Triangle Area: " + triangle.luasSegitiga());
                    System.out.println("Triangle Circumference: " +triangle.kelilingSegitiga());
                    break;
                case "persegi":
                    System.out.println("Input Square Side: ");
                    double inputSideSquare = input.nextDouble();
                    Square square = new Square(inputSideSquare);
                    System.out.println("Square Area: " +square.luasPersegi());
                    System.out.println("Square Circumference: " +square.kelilingPersegi());
                    break;
                case "persegi panjang":
                    System.out.println("Input Rectangular Width: ");
                    double inputWidthRec = input.nextDouble();
                    System.out.println("Input Rectangular Height: ");
                    double inputHeightRec = input.nextDouble();
                    Rectangular rectangular = new Rectangular(inputWidthRec, inputHeightRec);
                    System.out.println("Rectangular Area: " +rectangular.luasPersegiPanjang());
                    System.out.println("Rectangular Circumference: " +rectangular.kelilingPersegiPanjang());
                    break;
                default:
                    System.out.println("Shape is not available!");
            }













        }
    }
