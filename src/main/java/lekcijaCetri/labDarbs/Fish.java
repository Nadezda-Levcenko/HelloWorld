package lekcijaCetri.labDarbs;

public class Fish {
    double lenght;
    int weight;
    String color;
    String species;
    boolean liveInFreshWater = true;
    boolean zivsBeigta = true;
    boolean vaiIzsalkusi = true;
    public void printFish () {
        System.out.println("Tu esi noķēris " + species);
        System.out.println("Tas ir " + color + ", sver " + weight + "kg un ir " + lenght + "cm garš.");
        if (liveInFreshWater == true) {
            System.out.println("Tā ir salūdens zivs.");
        } else {
            System.out.println("Šī zivs mīt sālos ūdeņos.");
        }

        if (!zivsBeigta && vaiIzsalkusi) {
            System.out.println("Dzīva un uzsalkusi");
        }
    }
}
