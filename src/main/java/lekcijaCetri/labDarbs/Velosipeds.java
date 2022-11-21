package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;

    Date izgatavosanasDatums;

    Velosipeds(){  // bez argumentu konstruktors
        System.out.println("Taisām jaunu velo!!!");
        izgatavosanasDatums = new Date();
        System.out.println("Izgatavošanas datums " + izgatavosanasDatums);
    }

    Velosipeds(String zimols, int ramjaIzmers, int atrums){  // konstruktors ar argumentiem
        izgatavosanasDatums = new Date();
        this.zimols = zimols; // this - skatās uz klases mainīgajiem
        this.ramjaIzmers = ramjaIzmers;
        this.atrums = atrums;
    }

    public void printAtrums() {
        System.out.println(atrums);
    }

    public void paatrinajums( int paatrinajums) {
        System.out.println("Velo paatrinās");
        atrums = atrums + 5;
    }

    public void bremzesana() {
        System.out.println(zimols + " " + "Velo bremzē, atrums ir: " + atrums);
        if (atrums >= 5) {
            atrums = atrums - 5;
        } else {
            System.out.println("Beidz bremzēt, tu jau stāvi");
        }
    }
}
