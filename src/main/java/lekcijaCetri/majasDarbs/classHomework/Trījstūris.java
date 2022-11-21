package lekcijaCetri.majasDarbs.classHomework;

public class Trījstūris {
    public int malaA;
    public int malaB;
    public int malaC;
    double laukums;


    public Trījstūris() {
        System.out.println("Mēs veidojām trījstūri:");
    }


    public Trījstūris(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
        laukums = countTriangleArea();


    }

    public double countTriangleArea() {
        double s = (malaA + malaB + malaC) / 2;
        return Math.sqrt (s * (s - malaA) * (s - malaB) * (s - malaC));


    }

    public boolean vienadmalu() {

        if ((malaA == malaB) && (malaA == malaC))
            return true;
        else return false;
    }
    public boolean vienadsanu() {

        if ((malaA == malaB) || (malaA == malaC) || (malaB == malaC))
            return true;
        else return false;

    }

}
