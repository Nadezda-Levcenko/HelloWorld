package lekcijaPieci.labDarbs;

public class House {
    private int stavuDaudzums;
    private int loguSkaits;
    private int durvjuSkaits;
    private String adrese;
    private double griestuAugstums;
    private long kadastralaVertiba;
    private boolean vaiPrivatipasums;

    public int getStavuDaudzums() {
        return stavuDaudzums;
    }

    public void setStavuDaudzums(int stavuDaudzums) {
        this.stavuDaudzums = stavuDaudzums;
    }

    public int getLoguSkaits() {
        return loguSkaits;
    }

    public void setLoguSkaits(int loguSkaits) {
        this.loguSkaits = loguSkaits;
    }

    public int getDurvjuSkaits() {
        return durvjuSkaits;
    }

    public void setDurvjuSkaits(int durvjuSkaits) {
        this.durvjuSkaits = durvjuSkaits;
    }

    public String getAdrese() {
        return adrese;
    }

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }

    public double getGriestuAugstums() {
        return griestuAugstums;
    }

    public void setGriestuAugstums(double griestuAugstums) {
        this.griestuAugstums = griestuAugstums;
    }

    public long getKadastralaVertiba() {
        return kadastralaVertiba;
    }

    public void setKadastralaVertiba(long kadastralaVertiba) {
        this.kadastralaVertiba = kadastralaVertiba;
    }

    public boolean isVaiPrivatipasums() {
        return vaiPrivatipasums;
    }

    public void setVaiPrivatipasums(boolean vaiPrivatipasums) {
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuAugstums, long kadastralaVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    public void printHouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}');
    }
}
