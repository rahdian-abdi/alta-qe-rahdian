package com.assignment.oop.luaskeliling;

    public class Triangle extends Main {
        protected double base;
        protected double height;

        public Triangle(double base, double height){
            this.base = base;
            this.height = height;
        }

        public double luasSegitiga(){
            return (0.5 * base) * height;
        }

        public double kelilingSegitiga(){
            double setBase = 0.5 * base;
            double phyt = Math.pow(setBase,2) + Math.pow(height,2);
            double phytResult = Math.sqrt(phyt);
            return Math.round(base + (2*phytResult));
        }
    }
