package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
        public static void main(String[] args) {

        //1.uzdevums

        int x = 7;
        int y = 5;
        // a
        System.out.println(x > 0);
        // b
        System.out.println(x < 0);
        // c
        // int x = 7;
        System.out.println(x > y && x <= 10);
        // d
        System.out.println(!(x <= y) && x < 10);
        // e
        System.out.println(x == 0 || x == 10);
        // f
        System.out.println((x * y) > 10);

        //2.uzdevums
        int month = 12;
        String monthName;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Juny");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("This month doesn't exist");
        }

        //3.uzdevums
        int a = 3;
        int b = 28;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("Lielākais skaitlis ir " + a);
        } else if (b > a && b > c) {
            System.out.println("Lielākais skaitlis ir " + b);
        } else if (c > a && c > b) {
            System.out.println("Lielākais skaitlis ir " + c);
        }

        //4.uzdevums
        String luksofKrasa;
        System.out.println("Ievadi luksofora gaismas krāsu (zaļa, dzeltena vai sarkana): ");
        Scanner scanner = new Scanner(System.in);
        luksofKrasa = scanner.nextLine();

        if (luksofKrasa.equals("zaļa")) {
            System.out.println("Brauc!");
        } else if (luksofKrasa.equals("sarkana")) {
            System.out.println("Stāvi!");
        } else if (luksofKrasa.equals("dzeltena")) {
            System.out.println("Uzgaidi!");
        } else {
            System.out.println("Luksofors nedeg! Skaties zīmes!!!");
        }
        printBusinessCard();
        printBusinessCardTwo("Līga","Kalniņa",12312313,1965);
        printBusinessCardTwo("Juris","Vītols",5142431,1930);
    }
    //5.uzdevums
    public static void printBusinessCard(){
            for (int i = 1; i < 4; i++) {
                System.out.println("Vizītkarte" + "\n" + "##########" + "\n" + "Vārds: Nadežda" + "\n" + "Uzvārds: Ļevčenko" + "\n" +
                        "Telefona numurs: +371 26051455" + "\n" + "Dzimšanas gads: 1983" + "\n");
            }
    }
    //6.uzdevums
    public static void printBusinessCardTwo(String name, String surname, int phone, int birthYear){
         System.out.println("Vizītkarte" + "\n" + "##########" + "\n" + "Vārds: " + name + "\n" + "Uzvārds: " + surname + "\n" +
                    "Telefona numurs: +371 " + phone + "\n" + "Dzimšanas gads: " + birthYear + "\n");
    }
}
