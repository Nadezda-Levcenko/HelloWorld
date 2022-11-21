package lekcijaCetri.majasDarbs;

import lekcijaCetri.majasDarbs.classHomework.Trījstūris;

public class Main {
    public static void main(String[] args) {
        Trījstūris triangleA = new Trījstūris();
        triangleA.malaA = 10;
        triangleA.malaB = 14;
        triangleA.malaC = 14;
        System.out.println(triangleA.vienadmalu());
        System.out.println(triangleA.vienadsanu());



        Trījstūris triangleB = new Trījstūris(15, 15, 15);
        System.out.println(triangleB.countTriangleArea());
        System.out.println(triangleB.vienadmalu());
        System.out.println(triangleB.vienadsanu());

    }
}
