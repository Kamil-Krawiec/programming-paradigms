package com.company;

public class Prostopadloscian extends Prezent{
    private double a;
    private double b;
    private double h;

    public Prostopadloscian(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString()+"Prostopadloscian" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }

    @Override
    public double obliczPole() {
        polePowierzchni = 2*a*b+2*h*a+2*h*b;
        return polePowierzchni;
    }
}
