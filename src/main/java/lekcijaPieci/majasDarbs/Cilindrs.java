package lekcijaPieci.majasDarbs;

public class Cilindrs {
    private int r;
    private int h;
    double square;
    double volume;
    double pi = Math.PI;

    public Cilindrs(){

    }

    public Cilindrs(int r, int h){
        this.r = r;
        this.h = h;
    }

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }

    public int getH(){
        return h;
    }

    public void setH(int h){
        this.h = h;
    }

    public void cylinderSquare(){
        square = (2 * pi * r) * h + 2 * pi * (r * r);
        System.out.println("Cylinder square is " + square);
    }

    public void cylinderVolume (){
        volume = pi * (r * r) * h;
        System.out.println("Cylinder volume is " + volume);
    }

}
