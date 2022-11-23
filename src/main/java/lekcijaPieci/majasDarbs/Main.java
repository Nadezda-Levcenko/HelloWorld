package lekcijaPieci.majasDarbs;

public class Main {
    public static void main(String[] args) {
        Cilindrs cylinder = new Cilindrs();
        cylinder.setR(2);
        cylinder.setH(5);
        System.out.println("Cylinder radius is " + cylinder.getR());
        System.out.println("Cylinder height is " + cylinder.getH());
        cylinder.cylinderSquare();
        cylinder.cylinderVolume();

        Cilindrs cylinder1 = new Cilindrs(4, 7);
        System.out.println("Cylinder radius is " + cylinder1.getR());
        System.out.println("Cylinder height is " + cylinder1.getH());
        cylinder1.cylinderSquare();
        cylinder1.cylinderVolume();
    }
}
