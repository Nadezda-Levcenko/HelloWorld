package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
        // String = teikums vai vārds
        String vards = "Reksis";
        System.out.println("Suņa vārds ir: " + vards);
        String teksts = "Suņa vārds ir: ";
        System.out.println(teksts + vards);
        int vecums = 5;
        System.out.println("Suņa vecums ir: " + vecums);
        double svars = 5.4;
        System.out.println("Suņa svars ir: " + svars);
        boolean vaiIrIzsalcis = true;
        System.out.println("Vai suns ir izsalcis: " + true);
        if(vaiIrIzsalcis==true){
            System.out.println("Reksis ir izsalcis, viņu vajag pabarot.");

        }

        int temperatura = -10;
        System.out.println("Ziemā būs " + temperatura);

        // \n ieliec jaunu liniju, jāliek pediņās
        System.out.println("Suņa vārds ir: " + vards + "\nSuņa vecums ir: " + vecums);

        // maksimālā int vērtība
        int maxInt = 2147483647;
        // minimālā int vērtība
        int minInt = -2147483648;

        // pieņem veselu skaitli no -128 līdz +127
        byte vecumsDivi = 99;

        // no -32768 līdz 32767
        short latvijasMazpilseta = 17000;

        // super liels skaitlis, cipāra beigas jāielik L
        long zivisOkeana = 21474836499L;

        // Peldošais punkts (daiļskaitlis), vienmēr jāpieliek F
        float apavuIzmers = 44.5F;
        System.out.println("Apavu izmērs: " + apavuIzmers);

        // double F nevajag izmantot - šo izmantot visbiežāk
        double grauduSvars = 115.3;
        System.out.println("Tika pārdoti " + grauduSvars + "kg graudi");

        // Loģiskais: true or false. Piemērs: Šodien ir sestdiena, lielveikals ir atvērts
        boolean isOpen = true;
        //Turpretīm skolas ir slēgtas
        boolean isClosed = false;
        System.out.println("Vai veikals ir atvērts?" + isClosed);

        boolean isFebruary = false;
        boolean isLeapYear = true;

        // Teksts, kas tiek atzīmēts ar simbolu un ieliekām ''
        char valuta = '$';
        char atzimte = 'F';
        char dzimums = 'S';

        System.out.println("tests " + valuta + atzimte + dzimums);
        int a= 5;
        int b = 10;
        int summa;
        summa = a + b;
        System.out.println(summa);
        summa = a + a;
        System.out.println(summa);
        String name ="Juris";
        System.out.println(name);
        name = "Jānis";
        System.out.println(name);

        int x = 10;
        int y = -45;

        int rezultats = x+y;
        System.out.println(rezultats);

        rezultats = x-y;
        System.out.println(rezultats);

        rezultats = x*y;
        System.out.println(rezultats);

        rezultats = x/y;
        System.out.println(rezultats);

        rezultats = 10/5;
        System.out.println(rezultats);

        rezultats = 11/2;
        System.out.println(rezultats);

        // Atlikums 11/2 = 5 un atlikums 1
        rezultats = 11%2;
        System.out.println("Atlikums: " + rezultats);

        rezultats = 13 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/2;
        System.out.println(rezultats);

        //Kompanija
        String company = "KRONUS";
        //System.out.println("Uzņēmuma nosaukums ir: " + company);
        String pavadteksts = "Uzņēmuma nosaukums ir: ";
        System.out.println(pavadteksts + company);
        int gads = 1995;
        System.out.println("Uzņēmums dibināts " + gads + ".gadā.");
        double apgrozijums = 5.4;
        System.out.println("Gada apgrozījums sastāda " + apgrozijums + " miljonus euro.");
        boolean vaiIrChina = true;
        System.out.println("Vai uzņēmuma birojs ir Ķīnā?" + true);
        if(vaiIrChina==true){
            System.out.println("Ķīnas birojs veicīna darbības attīstību visā Āzijas reģionā.");
        }

    }
}
