package com.company;

import java.util.Arrays;

public class PrezentBezPoli {
    protected Figura ksztalt;
    protected double[] wymiary;
    protected double polePowierzchni;

    public PrezentBezPoli(Figura ksztalt, double[] wymiary) {
        this.ksztalt = ksztalt;
        this.wymiary = wymiary;
    }

    public double obliczPole(){
        if(ksztalt.equals(Figura.KULA)){
            polePowierzchni=4*3.14*wymiary[0]*wymiary[0];
            return polePowierzchni;
        }else if(ksztalt.equals(Figura.WALEC)){
            polePowierzchni=2*3.14+wymiary[0]*wymiary[0]+wymiary[1]*2*3.14*wymiary[0];
            return polePowierzchni;
        }else if(ksztalt.equals(Figura.PROSTOPADLOSCIAN)){
            polePowierzchni=2*wymiary[0]*wymiary[1]+2*wymiary[1]*wymiary[2]+2*wymiary[2]*wymiary[1];
            return polePowierzchni;
        }else if(ksztalt.equals(Figura.CZWOROSCIAN)){
            polePowierzchni = wymiary[0]*wymiary[0]* Math.sqrt(3);
            return polePowierzchni;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "PrezentBezPoli{" +
                "ksztalt=" + ksztalt +
                ", wymiary=" + Arrays.toString(wymiary) +
                ", polePowierzchni=" + polePowierzchni +
                '}';
    }
}
