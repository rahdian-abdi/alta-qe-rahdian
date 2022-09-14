package com.assignment.oop.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Operator (+/-/x/:) : ");
        char inputOperator = input.next().charAt(0);
        System.out.println("Input First Number: ");
        int inputFirstNumber = input.nextInt();
        System.out.println("Input Second Number: ");
        int inputSecondNumber = input.nextInt();

        Penjumlahan plus = new Penjumlahan();
        Pengurangan minus = new Pengurangan();
        Perkalian time = new Perkalian();
        Pembagian obe = new Pembagian();

        int resultAdd = plus.add(inputFirstNumber,inputSecondNumber);
        int resultMinus = minus.min(inputFirstNumber,inputSecondNumber);
        int resultTime = time.times(inputFirstNumber,inputSecondNumber);
        int resultObelus = obe.obelus(inputFirstNumber,inputSecondNumber);

        switch(inputOperator){
            case '+':
                System.out.println("Result is: " + resultAdd);
                break;
            case '-':
                System.out.println("Result is: " + resultMinus);
                break;
            case 'x':
                System.out.println("Result is: " + resultTime);
                break;
            case ':':
                System.out.println("Result is: " + resultObelus);
                break;
            default:
                System.out.println("Wrong operator!");
        }
    }
}
