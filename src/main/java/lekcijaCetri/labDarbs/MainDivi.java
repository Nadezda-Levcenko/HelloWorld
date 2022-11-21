package lekcijaCetri.labDarbs;

public class MainDivi {
    public static void main(String[] args) {
        Kakis kakisTaisons = new Kakis();
        kakisTaisons.suga = "Bezšķirnes";
        kakisTaisons.gadi = 2;
        kakisTaisons.vards = "Taisons";
        kakisTaisons.vaiIzsalcis = true;
        kakisTaisons.printKakis();

        System.out.println("\nZIVS");

        Fish zivsViens = new Fish();
        zivsViens.species = "Lāsis";
        zivsViens.weight = 1;
        zivsViens.lenght = 0.98;
        zivsViens.liveInFreshWater = true;
        zivsViens.zivsBeigta = false;
        zivsViens.vaiIzsalkusi = true;

        zivsViens.printFish();
    }
}
