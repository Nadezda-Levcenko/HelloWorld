package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LaboratorijasDarbsDivi {
    public static void main(String[] args) {

        //Salīdzināšanas izteiksmes
        //Lielāks
        int x = 3;
        int y = 2;
        //šeit būs true
        System.out.println(x > y);
        y = 3;
        //šeit būs false
        System.out.println(x > y);

        //Mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x < y);

        //Vienāds
        System.out.println(x == y);
        System.out.println(5 == 5);
        System.out.println(true == true);

        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));

        //Nav vienāds
        System.out.println(x != y);
        System.out.println(!luksaforaKrasa.equals("red")); //Vai luksofora krāsa nav vienāda ar green

        //Mazāk vienāds
        x = 6;
        y = 5;
        System.out.println(x <= y);
        x = 6;
        y = 7;
        System.out.println(x <= y);

        int vecums = 18;
        System.out.println("Vai cilvēks var balsot (kļūdains variants)? "  + (vecums>18));
        System.out.println("Vai cilvēks var balsot? "  + (vecums>=18));

        x = 5;
        y = 6;
        int z = 8;
        System.out.println(x < 6 && z > y);

        z = 2;
        System.out.println(x < 6 && z > y); //false, jo neizpildas kaut viens

        System.out.println(x < 6 || z > y); // true, jo izpildas kaut viens

        int age = 18;
        boolean hasVoted = false;
        System.out.println("Paskaties cilvēka pase.");
        if(age >= 18 && hasVoted == false){
            System.out.println("Drīkst balsot");
        }
        else {
            System.out.println("Nedrīkst balsot!");
        }

        //es aizeju un nobalsoju
        hasVoted = true;
        if(age >= 18 && hasVoted == false){
            System.out.println("Drīkst balsot");
        }
        else {
            System.out.println("Nedrīkst balsot!");
        }

        System.out.println("Tālākas darbības");

        //pārbaudīt vai skaitlis ir negatīvs, ja ir, izvadīt uz ekrāna tekstu - NEGATĪVS
        int skaitlis =-55;
        if(skaitlis > 0 ){
            System.out.println("Skaitlis ir pozotīvs");
        }
        else {
            System.out.println("Skaitlis ir negatīvs vai nulle");
        }

        String luksoforaKrasa = "green";
        if(luksoforaKrasa.equals("green")){
            System.out.println("Brauc!");
        }
        else {
            System.out.println("Stāvi!");
        }

        String luksoforaKrasa2 = "red";
        if(luksoforaKrasa2.equals("green")){
            System.out.println("Brauc!");
        }
        else {
            System.out.println("Stāvi!");
        }

        if(skaitlis <= 0){
            System.out.println("NEGATĪVS");
           // System.exit(0);
        }

        System.out.println("Ievadīsim skaitli i");
        int i = 7;
        if (i == 10) {
            System.out.println("Skaitlis ir 10");
        } else if (i == 15) {
            System.out.println("Skaitlis ir 15");
        } else if (i == 20){
            System.out.println("Skaitlis ir 20");
        } else {
            System.out.println("Skaitlis nav neviens no vajadzīgajiem");
        }

        //zaļa gaisma, sarkana gaisma, dzeltena gaisma, nedeg neviena gaisma(skatamies zīmes)
        String luksofKrasa;
        System.out.println("Ievadi luksofora krāsu (red, yellow or green): ");
        Scanner scanner = new Scanner(System.in);
        luksofKrasa = scanner.nextLine();

        if (luksofKrasa.equals("green")){
            System.out.println("Brauc!");
        } else if (luksofKrasa.equals("red")) {
            System.out.println("Stāvi!");
        } else if (luksofKrasa.equals("yellow")) {
            System.out.println("Uzgaidi!");
        } else {
            System.out.println("Luksofors nedeg! Skaties zīmes!!!");
        }

        //Noteikt, vai ievadītais skaitlis ir pāra vai nepāra skaitlis
        int number = scanner.nextInt();
        //te uzrakstīt kodu, kurš izvada vai skaitlis ir pāra vai nepāra
        if (number % 2 == 0){
            System.out.println(number + " ir pāra skaitlis.");
        } else {
            System.out.println(number + " ir nepāra skaitlis.");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1: System.out.println("Janvāris");
            break;
            case 2: System.out.println("Februāris");
            break;
            case 3: System.out.println("Marts");
            break;
            case 4: System.out.println("Aprīlis");
            break;
            default: System.out.println("Šāds mēnesis neeksistē");
        }

        String animal = "CAT";
        String result;
        switch (animal){
            case "DOG":
            case "CAT": result = "Domestic animal.";
            break;
            case "TIGER": result = "Wild animal.";
            break;
            default: result = "Unknown animal.";
        }
        System.out.println("This animal is: " + result);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Hello lekcija 2");

        String personasKods = "020292-12504";
        boolean vaiIrBalsojis = true;

        int vecumsX;

        System.out.println("Kā tevi sauc?");
        String name = scanner1.nextLine();
        System.out.println("Labdien, " + name + "! Esi sveicināts/-a manā programmā.");

        System.out.println("Ievadi cilvēka vecumu...");
        vecumsX = scanner.nextInt();

        if(vecumsX >= 18){
            System.out.println("Cilvēks drīkst balsot");
        }
        System.out.println("Programmas turpinājums...");

        System.out.println("Ievadi skatli a");
        int a = scanner1.nextInt();
        System.out.println("Ievadi skatli b");
        int b = scanner1.nextInt();
        int summa = a + b;
        System.out.println("Skaitļa " + a + " un skaitļa " + b + " summa ir " + summa);

        System.out.println("Ievadi skaitli g");
        int g = scanner1.nextInt();
        if (g < 0){
            System.out.println("Skaitlis ir negatīvs");
        } else if (g == 0) {
            System.out.println("Skaitlis ir nulle");
        } else {
            System.out.println("Skaitlis ir pozitīvs");
        }

    }
}
