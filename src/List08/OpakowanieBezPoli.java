package com.company;

public abstract class OpakowanieBezPoli {
    protected String nazwaPakunku;
    protected PrezentBezPoli prezent;

    public OpakowanieBezPoli(String nazwaPakunku, PrezentBezPoli prezent) {
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
