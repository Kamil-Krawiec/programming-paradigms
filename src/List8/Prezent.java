package com.company;

public abstract class Prezent {
    protected double polePowierzchni;

    public Prezent(){
        polePowierzchni=0;
    }

    public abstract double obliczPole();

    @Override
    public String toString() {
        return "Prezent{" +
                "polePowierzchni=" + polePowierzchni;
    }

    public double getPolePowierzchni() {
        return polePowierzchni;
    }
}
