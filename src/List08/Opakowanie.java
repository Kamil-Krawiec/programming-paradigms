package com.company;

public abstract class Opakowanie{
    protected String nazwaPakunku;
    protected Prezent prezent;

    public Opakowanie(String nazwaPakunku,Prezent prezent) {
        this.nazwaPakunku = nazwaPakunku;
        this.prezent = prezent;
    }

    @Override
    public String toString() {
        return "Opakowanie{" +
                "nazwaPakunku='" + nazwaPakunku +
                prezent.toString();
    }
}
