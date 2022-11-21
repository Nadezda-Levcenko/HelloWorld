package lekcijaCetri.labDarbs;

public class House {
    public House(String adrese, int stavuDaudzums, int loguSkaits, int durvjuSkaits, double grieztuAugstums, long kadastralaVertiba, boolean vaiPrivatipasums) {
        this.adrese = adrese;
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.grieztuAugstums = grieztuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    String adrese;
    int stavuDaudzums;
    int loguSkaits;
    int durvjuSkaits;
    double grieztuAugstums;
    long kadastralaVertiba;
    boolean vaiPrivatipasums;


    public void printHouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + grieztuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}');
    }

}
