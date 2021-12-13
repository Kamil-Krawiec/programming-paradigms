package com.company;
//ZADANIE 2
//czworoscian zostal dodany w zadaniu 2
public class Czworoscian extends Prezent{
    private double a;

    public Czworoscian(double a) {
        this.a = a;
    }

    @Override
    public double obliczPole() {
        polePowierzchni = a*a* Math.sqrt(3);
        return polePowierzchni;
    }

    @Override
    public String toString() {
        return "Czworoscian{" +
                "a=" + a +
                '}';
    }
}
