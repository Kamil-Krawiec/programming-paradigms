package com.company;

public class Kula extends Prezent{


    private double r;


    public Kula(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString()+"{Kula" +
                "r=" + r +
                '}';
    }

    @Override
    public double obliczPole() {
        polePowierzchni=4*3.14*r*r;
        return polePowierzchni;
    }
}
