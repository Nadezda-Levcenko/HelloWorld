package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Juris";
        House majaViens = new House("Rīgas iela 2", 10, 50, 25, 3.25, 150000,true);
        majaViens.printHouse();

        House majaDivi = new House("Rostokas iela 12", 6, 8, 6, 2.5, 75000, false);
        majaDivi.printHouse();

        char[] mansVards = {'J', 'R', 'I'};
        int i  = 1;
        for (char burts : mansVards) {
            System.out.println("CIKLS NR:" + i);
            System.out.println(burts);
            i++;
        }

        House[] majas = {majaViens, majaDivi};
        for (House maja : majas) {
            maja.printHouse();
        }


        Velosipeds mansVelo = new Velosipeds();
        mansVelo.atrums = 2;
        mansVelo.printAtrums();
        Velosipeds mansVelo2 = new Velosipeds();
        mansVelo2.printAtrums();


        Velosipeds ritenBraucejsViens = new Velosipeds();
        for (int j = 0; j < 10; j++) {
            new Velosipeds();
            
        }
        ritenBraucejsViens.atrums = 40;
        ritenBraucejsViens.printAtrums();


        Velosipeds ritenBraucejsDivi = new Velosipeds();
        ritenBraucejsDivi.atrums = 30;
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenisX = new Velosipeds("Merino", 21, 100);

        Velosipeds ritenBraucejsTris = new Velosipeds();
        ritenBraucejsTris.zimols = "ZZK";
        ritenBraucejsTris.printAtrums();

        ritenBraucejsTris.paatrinajums(10);
        ritenBraucejsTris.paatrinajums(20);
        ritenBraucejsTris.paatrinajums(5);
        ritenBraucejsTris.paatrinajums(15);

        ritenBraucejsTris.printAtrums();
        System.out.println("Priekšā izskrien kaķis");

        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.printAtrums();


        Auto mansAuto = new Auto();
        mansAuto.zimols = "BMW";
        mansAuto.ritenuIzmers = 22;
        mansAuto.vaiIrAvarija = false;
        mansAuto.maxAtrums = 255.5;
        mansAuto.printAtrums();

        mansAuto.paatrinajums();
        mansAuto.paatrinajums();
        mansAuto.paatrinajums();
        mansAuto.paatrinajums();
        mansAuto.paatrinajums();
        mansAuto.paatrinajums();
        mansAuto.printAtrums();

        System.out.println("Uz ceļa ir šķērslis");
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.bremzesana();
        mansAuto.printAtrums();

        Rinkis rinkisViens = new Rinkis(5);
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());

        Rinkis rinkisDivi = new Rinkis(10);
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatLinijasGarumu());


//
//        int a = 5;
//        int b = 10;
//        Math.max(a,b); // atgriež lielāko skaitli
    }
}
