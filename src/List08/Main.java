package com.company;

public class Main {

    public static void main(String[] args) {
        Pakunkowy elf = new Pakunkowy(100,1000);
        Opakowanie prezentOpakowany =elf.opakuj(new Kula(10));
        System.out.println(prezentOpakowany.toString());

        PakunkowyBezPoli elfik = new PakunkowyBezPoli(10,100);
        OpakowanieBezPoli bezPoliPrezent = elfik.opakuj(new PrezentBezPoli(Figura.KULA, new double[]{10}));
        System.out.println(bezPoliPrezent.toString());

        OpakowanieBezPoli bezpoliCzworoscian = elfik.opakuj(new PrezentBezPoli(Figura.CZWOROSCIAN,new double[]{10}));

        System.out.println(bezpoliCzworoscian.toString());
    }
}
