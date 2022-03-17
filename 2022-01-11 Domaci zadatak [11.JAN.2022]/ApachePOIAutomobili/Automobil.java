package ApachePOIAutomobili;

public class Automobil {
    private String marka;
    private String zemljaPorekla;
    private String boja;
    private double kilometraza;

    public Automobil(String marka, String zemljaPorekla, String boja, double kilometraza) {
        this.marka = marka;
        this.zemljaPorekla = zemljaPorekla;
        this.boja = boja;
        this.kilometraza = kilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", zemljaPorekla='" + zemljaPorekla + '\'' +
                ", boja='" + boja + '\'' +
                ", kilometraza=" + kilometraza +
                '}';
    }
}
