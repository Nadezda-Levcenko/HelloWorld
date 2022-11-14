package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        System.out.println("1.uzdevums");
        int number;
        int sum = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ievadi veselu skaitli līdz 100");
            number = scanner.nextInt();
            sum = sum + number;
        } while (sum < 101);
        System.out.println("Gatavs! Summa ir " + sum);
        printNewLine();
        otraisUzdevums();
        printNewLine();
        tresaisUzdevums();
        printNewLine();
        ceturtaisUzdevums();
        printNewLine();
        piektaisUzdevums();
        printNewLine();
        sestaisUzdevums();
    }

    public static void otraisUzdevums() {

        System.out.println("2.uzdevums");
        int num = 11;
        boolean vaiIrPirmskaitlis = (num > 1);
        {
            if (num % 2 == 0 && num != 2) {
                vaiIrPirmskaitlis = false;
                System.out.println(num + " nav pirmskaitlis ");
            } else if (num % 3 == 0 && num != 3) {
                vaiIrPirmskaitlis = false;
                System.out.println(num + " nav pirmskaitlis ");
            } else if (num % 5 == 0 && num != 5) {
                vaiIrPirmskaitlis = false;
                System.out.println(num + " nav pirmskaitlis ");
            } else {
                vaiIrPirmskaitlis = true;
                System.out.println(+num + " ir pirmskaitlis ");
            }
        }
    }

    public static void tresaisUzdevums(){

        System.out.println("3.uzdevums");
        int[] cipari = {7,15,23,48,56,99};
        String[] nedelasDiena = {"Pirmdiena", "Otrdiena", "Trešdiena", "Ceturdiena", "Piektdiena", "Sestdiena",
                "Svētdiena"};
        char[] atzimesSkola = {'S', 'T', 'A', 'P'};
        int counter = 0;

        int x = 0;
        while (x < cipari.length){
            System.out.println("Izdava ciparu " + cipari[x]);
            x++;
        }

        int y = 0;
        while (y < nedelasDiena.length) {
            System.out.println(nedelasDiena[y]);
            y ++;
        }

        int z = 0;
        while (z < atzimesSkola.length) {
            System.out.println(atzimesSkola[z]);
            z ++;
        }

        System.out.println("\n");

        int x1 = 0;
        do {
            System.out.println("Cipars: " + cipari[x1]);
            x1 ++;
        } while (x1 < 3);

        int y1 = 0;
        do {
            System.out.println("Šodien ir " + nedelasDiena[y1]);
            y1++;
        } while (y1 < 5);

        int z1 = 0;
        do {
            System.out.println("Atzīme skolā: " + atzimesSkola[z1]);
            z1++;
        } while (z1 < (atzimesSkola.length));

        System.out.println("\n");

        for (int j = 0; j < cipari.length; j++) {
            System.out.println("Cipars " + cipari[j]);
        }

        for (int j = 0; j < nedelasDiena.length; j++) {
            System.out.println("Rīt  būs " + nedelasDiena[j]);
        }

        for (int j = 0; j < atzimesSkola.length; j++) {
            System.out.println("Atzīme " + atzimesSkola[j]);
        }

        System.out.println("\n");

        for (int cipars : cipari) {
            System.out.println("Cipars " + cipars);
        }

        for (String diena : nedelasDiena) {
            System.out.println("Nēdeļas diena " + diena);
        }

        for (char atzime : atzimesSkola) {
            System.out.println("Atzīme " + atzime);
        }
    }

    public static void ceturtaisUzdevums() {

        System.out.println("4.uzdevums");
        int[] datuMasivs = new int[100];
        for (int i = 2; i <= datuMasivs.length; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }

    public static void piektaisUzdevums(){

        System.out.println("5.uzdevums");
        int c = 5;
        int faktorials = 1;
        for (int d = 1; d <= c; d++) {
            faktorials = faktorials * d;
        }
        {System.out.println(faktorials);}
    }

    public static void sestaisUzdevums(){

        System.out.println("6.uzdevums");
        final int password = 3231;
        int userEnteredPassword;

        Scanner scannerTwo = new Scanner(System.in);
        int chances = 3;
        System.out.println("Ievadiet paroli. Jums ir " + chances + " mēginājumi.");
        while (chances > 0) {
            userEnteredPassword = scannerTwo.nextInt();
            chances--;

            if (userEnteredPassword == password) {
                System.out.println("PIN ir pieņemts, laipni lūdzām atpakaļ.");
            } else if (userEnteredPassword != password && chances > 0) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz. Paliekošo mēginājumu skaits ir " + chances);
            } else {
                System.out.println("Jūs esat bloķēts");
            }
        }
    }

    public static void printNewLine(){
        System.out.println("\n");
    }
}
