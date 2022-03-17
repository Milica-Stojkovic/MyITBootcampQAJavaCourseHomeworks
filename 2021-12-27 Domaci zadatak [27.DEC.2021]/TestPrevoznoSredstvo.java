package dz27122021;

public class TestPrevoznoSredstvo {
    public static void main(String[] args) {

    PrevoznoSredstvo ps = new PrevoznoSredstvo(2001, "Japan", "Honda");
    Automobil a = new Automobil(2020,"Nemacka","Mercedes","dizel",1994);
    Autobus bus = new Autobus(2019,"Italija","Fiat",40);
    Voz v = new Voz(1975,"Srbija","jkp",12);

        ps.sirena();
        a.sirena();
        bus.sirena();
        v.sirena();
    }
}
