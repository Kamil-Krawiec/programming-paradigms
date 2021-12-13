package com.company;

public class Pakunkowy {

    private double max;
    private double min;


    public Pakunkowy(double min, double max) {
        this.max = max;
        this.min = min;
    }

    public Opakowanie opakuj(Prezent prezent){
        double polePlusZakladka=1.05*prezent.obliczPole();
        Opakowanie prezencik;
        if(polePlusZakladka<min){
            prezencik = new PapierBialy(prezent);
        }else if(polePlusZakladka>=min && polePlusZakladka<max){
            prezencik = new PapierKolorowy(prezent);
        }else {
            prezencik = new PapierSzary(prezent);
        }
        return prezencik;
    }
}
