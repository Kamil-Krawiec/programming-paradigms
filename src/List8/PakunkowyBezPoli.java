package com.company;

public class PakunkowyBezPoli {

    private double max;
    private double min;


    public PakunkowyBezPoli(double min, double max) {
        this.max = max;
        this.min = min;
    }

    public OpakowanieBezPoli opakuj(PrezentBezPoli prezent){
        double polePlusZakladka=1.05*prezent.obliczPole();

        OpakowanieBezPoli prezencik;
        if(polePlusZakladka<min){
            prezencik = new PapierBialyBezPoli(prezent);
        }else if(polePlusZakladka>=min && polePlusZakladka<max){
            prezencik = new PapierKolorowyBezPoli(prezent);
        }else {
            prezencik = new PapierSzaryBezPoli(prezent);
        }
        return prezencik;
    }
}
