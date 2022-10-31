package lekcijaViens.majasDarbs;

public class Main {
    public static void main(String[] args) {
        String population = "Iedzīvotāju skaits: ";
        double populSkaits = 1.207;
        String area = "Platība: ";
        int areaKm = 9251;
        String km = "km²";
        String capital = "Galvaspilsēta: ";
        String capitalName = "Nikozija";
        String valoda = "Oficiālā valoda: ";
        String language = "Grieķu, Turku";
        String EU = "Vai ir ES dalībvalsts: ";
        boolean es = true;
        String valuta = "Valūta: ";
        char currency = '€';

        String sum = "Summa: ";
        int summa;
        String starp = "Starpība: ";
        int starpiba;
        String reiz = "Reizinājums: ";
        int reizinajums;
        String dal = "Dalījums: ";
        int dalisana;
        double dalijums;
        String cipX = "1. cipārs: ";
        String cipY = "2. cipārs: ";
        int x = 10;
        int y = 2;
        double z = 20;
        double a = 100;
        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalisana = x / y;
        dalijums = z / a;

        System.out.println("Kipra" + "\n");
        System.out.println(population + populSkaits + " " + "miljoni");
        System.out.println(area + areaKm + " " + km);
        System.out.println(capital + capitalName);
        System.out.println(valoda + language);
        System.out.println(EU + es);
        System.out.println(valuta + currency);
        System.out.println("\n");

        System.out.println("Aritmētiskie operatori" + "\n");
        System.out.println(cipX + x + "\n" + cipY + y);
        System.out.println(sum + summa);
        System.out.println("Summa 2: " + (a + z));
        System.out.println(starp + starpiba);
        System.out.println("Starpība 2: " + (a - z));
        System.out.println(reiz + reizinajums);
        System.out.println("Reizinājums 2: " + (z * a));
        System.out.println(dal + dalisana);
        System.out.println("Dalījums 2: " + dalijums);
        System.out.println("Atlikums: " + y % x);
        System.out.println("Atlikums 2: " + a % z);

    }

}


