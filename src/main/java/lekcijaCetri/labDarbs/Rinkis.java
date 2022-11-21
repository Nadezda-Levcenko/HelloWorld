package lekcijaCetri.labDarbs;

public class Rinkis {
    double r = 0;

    final double PI = 3.14; //final nozīme, ka vērība nemainās
//    double PI = Math.PI;

//    static double PI = 3.14; static mainīgie atbilst visai klases definicijai, ja tā nav, t.i. objekta mainīgais


    public Rinkis(double r) {
        this.r = r;
    }

    public double rekinatLaukumu() {
        return r * r * PI;
    }

    public double rekinatLinijasGarumu(){
        return 2 * PI * r;
    }

}

