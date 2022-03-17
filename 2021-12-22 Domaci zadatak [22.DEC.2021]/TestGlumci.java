package dz22122021;

public class TestGlumci {
    public static void main(String[] args) {

        System.out.println("------------- Prvi glumac ------------");

        Glumac g1 = new Glumac("Dragan", "Bjelogrlic", 'm', 56, 8.6, true);
        stampajGlumci(g1);

        System.out.println("------------- Drugi glumac ------------");

        Glumac g2 = new Glumac("Jean","Reno", 'm', 62, 9.7, false);
        stampajGlumci(g2);

        System.out.println("------------- Treci glumac ------------");

        Glumac g3 = new Glumac("Mirjana", "Karanovic", 'z', 58, 10, true);
        stampajGlumci(g3);
    }
    public static void stampajGlumci(Glumac glumac) {
        System.out.println("Glumac: " + glumac.getIme() + " " +glumac.getPrezime());
        System.out.println("Glumac ima: " + glumac.getGodine() +" godina");
        System.out.println("Pol: " + glumac.getPol());
        System.out.println("Ocena: " + glumac.getOcena());
        System.out.println("Poreklom iz Srbije: " + glumac.izSrbijeDaNe() );
    }
}


