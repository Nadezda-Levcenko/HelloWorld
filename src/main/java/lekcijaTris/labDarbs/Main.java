package lekcijaTris.labDarbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sākās porogramma");
        printCard2("Pētreis","Kalniņš", "Ventspils", 35);
        printCard2("Anna", "Blūma", "Dobele", 24);

        String name = "Juris";
        String surname = "Kreilis";
        String town = "Rīga";
        int age = 32;
        printCard2(name, surname, town, age);

        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(4,2);
        System.out.println("Taisnstūra laukums ir: " + laukums);
        System.out.println(average(3.4, 3.2,5.4));

        macamiesMasivus();
        whileCikls();
    }

    public static void whileCikls(){
        int x = 5;
        while(x >= 0){
            System.out.println("X nav nulle, X = " + x);
            x--; // tas pats, kas x = x - 1
        }

        int i = 10;
        while (i < 50){
            System.out.println("I ir " + i);
            i++; // tas pats, kas i = i + 1
        }

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes", "Audi"};

        System.out.println("Kods sākās");
        int z = 0;
        String visiAuto = "";
        while (z < cars.length){
            System.out.println(cars[z]);
            visiAuto = visiAuto + cars[z] + " ";
            z = z + 1;
        }
        System.out.println(visiAuto);
        System.out.println("Kods turpinās");

        //uzdevums 1 - izprintēt visus skaitļus no mēneša tērini masīva uz ekranā
        int[] menesaTerini = {100, 40, 23, -44, 55, 200};
        int q = 0;
        //String visiTerini = "";
        while (q < menesaTerini.length) {
            System.out.println(menesaTerini[q]);
            //visiTerini = visiTerini + menesaTerini[q] + " ";
            q++;
        }
        //System.out.println("Visi mēneša terini:" + visiTerini);

        //uzevums 2 - pieprasīt no lietotāja ievadīt veselu skaitli, kamēr skaitli ir pozitīvi
        //saskaitīt tos un izvadīt uz ekrāna summu, ja ir ievadīt 0 vai negatīvs (jāizmanto scanner)

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
        while (number > 0){
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("Summa ir: " + summa);

        String[] kartis = {"Pīka dūzis", "Ercena kapls", "Kreiča dāma"};
        int c = 0;
        while (c < kartis.length){
            System.out.println(kartis[c]);
            c++;
        }

        // do.... while
        int v = 0;
        do{
            System.out.println("TEST TEST TEST");
            v++;
        } while (v < 10);

        String parole = "SuperSecretPassword123";
        String ievaditaParole;
        do{
            System.out.println("Ievadi paroli");
            ievaditaParole = ievade.nextLine();
            System.out.println("Pārbaudām paroli");
        }while (!ievaditaParole.equals(parole));

        System.out.println("Pareiza parole");

        //for
        String[] kartis2 = {"Pīka dūzis", "Ercena kapls", "Kreiča dāma"};
// for each
        for (String vienaKarts : kartis2) {
            System.out.println(vienaKarts);
        }
//for
        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }

        for (int w = 0; w <= 20; w = w + 2) {
            if(w ==6){
                break;
            }
            System.out.println(w);
        }

        //for each
        long[] telefonaNumuri = {222222, 3333333, 444444, 555555, 6666666};
        for (long numurs : telefonaNumuri) { //numurs vietā var ierakstīt vienalga ko
            System.out.println(numurs);
        }

        //Šobrīd ciematā ir iespēja iegādāties mājas ar mājās numuriem no 1 līdz 50.
        //Pircējs vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurd dalās at 3 vai 5.
        // Cik māju numuri atbilst prasībām?

        int count = 0;
        for (int m = 1; m <= 50; m++) {
            //System.out.println("Mājas numuri: " + m);
            if(!(m%3==0 || m%5 == 0)){
                // vai if(m%3==0 || m%5 == 0){
                //System.out.println("Šie numuri neder " + m);
           // } else {
                count++;
            }
        }
        System.out.println("Der " + count + " māju numuri");
        
        //nodefinēt savu vārdu kā masīvu ar burtiem (char)
        //izmantojot for each ciklu, izvadīt savu vārdu uz ekrāna
        
        char[] vards = {'N', 'A', 'D', 'J', 'A'};
        for (char mansVards: vards) {
            System.out.println(mansVards);
        }

    }

    public static void macamiesMasivus(){
        //ja masīva izmērs ir 3, tad pirmā vērtība būs 0
        String dogName;
        String dogname2 = "Reksis";

        int[] menesaTerini = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]); ///piens
        System.out.println(produktuSaraksts[1]); //Maize
        System.out.println(produktuSaraksts[2]); //Olas
        System.out.println(menesaTerini[3]);

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); // desa

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("Masīva garums ir: " + cars.length);

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        cars[1] = "AUDI";
        String studentuSaraksts[] = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņš";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);
    }

    public static double average(double x, double y, double z){
        return (x+y+z)/3;

    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums){
        int laukums = platums * garums;
        return laukums;
    }

    public static void printNewLine(){
        System.out.println("\n");
    }
    public static void printCard(){
        System.out.println("@@@@@@@@@@@@");
        System.out.println("Nadežda Ļevčenko");
        System.out.println("Rīga");
        System.out.println("Vecums: " + 50);
        System.out.println("$$$$$$$$$$$$$");
    }

    public static void printCard2(String vards, String uzvards, String pilseta, int vecums){
        System.out.println("@@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums: " + vecums);
        System.out.println("$$$$$$$$$$$$$");
    }

}
