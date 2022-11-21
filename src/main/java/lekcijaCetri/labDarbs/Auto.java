package lekcijaCetri.labDarbs;

public class Auto {
    String zimols;
    int ritenuIzmers;
    boolean vaiIrAvarija;
    double maxAtrums;
    int atrums = 0;

    public void printAtrums() {
        System.out.println(atrums);
    }
    public void paatrinajums() {
        System.out.println("Auto paatrinās");
        atrums = atrums + 10;
    }

    public void bremzesana() {
        System.out.println(zimols + " " + "bremzē, atrums ir: " + atrums);
        if (atrums >= 5) {
            atrums = atrums - 5;
        } else {
            System.out.println("Beidz bremzēt, tu jau stāvi");
        }
    }
}
