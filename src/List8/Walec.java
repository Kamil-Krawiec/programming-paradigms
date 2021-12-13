package com.company;

public class Walec extends Prezent{
    private double r;
    private double h;

    public Walec(double promien, double wysokosc) {
        this.r = promien;
        this.h = wysokosc;
    }

    @Override
    public String toString() {
        return super.toString()+"Walec" +
                "r=" + r +
                ", h=" + h +
                '}';
    }

    @Override
    public double obliczPole() {
        polePowierzchni=2*3.14*r*r+h*2*3.14*r;
        return polePowierzchni;
    }
}
